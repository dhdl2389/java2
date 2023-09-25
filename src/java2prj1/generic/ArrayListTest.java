package java2prj1.generic;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Score> list = new ArrayList<>();
		list.add(new Score("이윤", 99, 90));
		list.add(new Score("서예진", 100, 100));

		for (int i = 0; i < list.size(); i++) {
			Score s = list.get(i);
			System.out.println(s);
		}

	}
}
