package java2prj1.lamda;

import java.util.function.Predicate;

/*
 * interface Predicate<T>{
 *   Boolean test (T t);
 * }
 * */
public class PredicateTest {
	public static void main(String[] args) {

		Predicate<Integer> p1 = (su) -> {

			if (su % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean result1 = p1.test(2);
		System.out.println(result1);

		Predicate<String> p2 = (str) -> {

			if (str.equalsIgnoreCase("STOP")) {
				return true;
			} else {
				return false;
			}
		};

		boolean result2 = p2.test("stop");
		System.out.println(result2);

		Predicate<Integer> p3 = new Predicate<>() {

			@Override
			public boolean test(Integer t) {

				if (t > 19) {
					return true;
				}
				return false;
			}
		};
		boolean result3 = p3.test(19);
		System.out.println(result3);
	}
}
