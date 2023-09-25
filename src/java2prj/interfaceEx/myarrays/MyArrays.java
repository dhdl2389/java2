package java2prj.interfaceEx.myarrays;

import java.util.Comparator;

import MyArrays.interfaceEx.MyComparator;

interface MyComparable {
	public int compareTo(Object other); // 기준이 크면 양수, 작으면 음수, 없으면 0
}

// Arrays를 간단하게 구현하였다.
public class MyArrays {
	public static void sort(Object[] arr) { // 모든 객체타입을 정렬하기 위해서 Object[]

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				MyComparable m = (MyComparable) arr[i];
				if (m.compareTo(arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}
	}
	/*
	 * interface Comparator { public int compare(Object o1, Object o2); }
	 */

	public static void sort(Object[] arr, Comparator c) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 교환
				if (c.compare(arr[i], arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}

	}

}