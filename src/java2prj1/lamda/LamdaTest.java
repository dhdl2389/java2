package java2prj1.lamda;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface mathPow {
	int mathPow(int a, int b);
}

public class LamdaTest {
	public static void main(String[] args) {
		class mathPowImp implements mathPow {

			@Override
			public int mathPow(int a, int b) {
				// TODO Auto-generated method stub
				return (int) Math.pow(a, b);
			}
		}
		mathPowImp f1 = new mathPowImp();
		int result1 = f1.mathPow(2, 4);
		System.out.println(result1);

		mathPow f2 = new mathPow() {

			@Override
			public int mathPow(int a, int b) {

				return (int) Math.pow(a, b);
			}
		};
		int result2 = f2.mathPow(2, 4);
		System.out.println(result2);

		mathPow f3 = (a, b) -> {
			int value;
			value = (int) Math.pow(a, b);
			return value;
		};

		int result3 = f3.mathPow(2, 4);
		System.out.println(result3);

		//
		UnaryOperator<Integer> squre = x -> (int) Math.pow(x, 4);
		int num = 2;
		int result4 = squre.apply(num);
		System.out.println(result4);

		//
		BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
		int result5 = max.apply(5, 10);
		System.out.println(result5);

		//
		BiConsumer<String, Integer> printVar = (String name, Integer age) -> {
			System.out.println(name + "=" + age);
		};

		printVar.accept("홍길동", 12);

		//
		UnaryOperator<Integer> getRandom = (Integer asd) -> {
			return (int) (Math.random() * 6) + 1;
		};

		int result6 = getRandom.apply(0);
		System.out.println(result6);
	}
}
