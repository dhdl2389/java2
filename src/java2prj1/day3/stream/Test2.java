package java2prj1.day3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		// String[] test = { "one", "two", "three" };
		String[] arr = new String[] { "one", "two", "three" };
		Arrays.sort(arr);

		for (String s : arr) {
			System.out.println(s);
		}

		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		for (String s : list) {
			System.out.println(s);
		}

		// 배열은 스트림으로
		Stream<String> stream1 = Arrays.stream(arr);

		// ArrayList 스트림으로
		Stream<String> stream2 = list.stream();

		stream1.sorted().forEach(s -> System.out.println(s));
		System.out.println("================================");
		stream2.sorted().forEach(s -> System.out.println(s));
	}
}
