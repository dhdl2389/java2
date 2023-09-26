package java2prj1.lamda;

import java.util.function.Function;

/*
 * interface Function<T , R>{
 * 	R apply();
 * }
 * */
public class FunctionTest {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = su -> su * 2;
		int result = f1.apply(3);
		System.out.println(result);

		Function<Integer, Integer> f3 = new Function<>() {

			@Override
			public Integer apply(Integer t) {

				return 2 * t;
			}
		};
		int result2 = f3.apply(1000);
		System.out.println(result2);

		Function<Integer, String> f4 = num -> {
			String re = "";
			for (int i = 1; i <= num; i++) {
				re += "람다좋아";
			}
			return re;
		};
		String result3 = f4.apply(4);
		System.out.println(result3);
	}
}
