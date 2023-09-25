package java2prj.interfaceEx.myarrays;

import java.util.*;

import MyArrays.interfaceEx.MyComparator;

public class ScoreTest2 {
	public static void main(String[] args) {

		Score[] list = new Score[4];

		list[0] = new Score(100, 90);
		list[1] = new Score(80, 99);
		list[2] = new Score(99, 87);
		list[3] = new Score(70, 60);

		// 객체배열

		for (Score score : list) {
			System.out.println(score);
		}
		Arrays.sort(list);
		System.out.println("국어성적순");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);

		}

	}

}
