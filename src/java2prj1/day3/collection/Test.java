package java2prj1.day3.collection;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		//
		List<String> list = null;
		ArrayList<String> alist = new ArrayList<>();
		alist.add("one");
		alist.add("two");
		alist.add("three");

		list = alist;
		list.forEach(item -> System.out.println(item));

		//
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("oneL");
		llist.add("twoL");
		llist.add("threeL");

		list = llist;
		list.forEach(item -> System.out.println(item));
	}

}
