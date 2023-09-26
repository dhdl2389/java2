package java2prj1.lamda.sort;

import java.util.*;
import java.util.function.Consumer;

import java2prj.interfaceEx.myarrays.MyArrays;

public class MovingList {

	public static void main(String[] args) {

		ArrayList<Moving> list = new ArrayList<>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평", 88));

		// 이름순 정렬
		Collections.sort(list);
		list.forEach(m -> System.out.println(m));

		System.out.println("=======================================");

		list.forEach(new Consumer<Moving>() {

			@Override
			public void accept(Moving t) {
				System.out.println(t);

			}
		});

		System.out.println("=================이름순=================");

		class ConsumerImp implements Consumer<Moving> {

			@Override
			public void accept(Moving t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		}

		list.forEach(new ConsumerImp());

		// 암호순 정렬
		System.out.println("=================암호순=================");

		list.sort(new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {

				return o1.code.compareTo(o2.code);
			}
		});
		list.forEach(new ConsumerImp());

		// 파워순 정렬

		System.out.println("=================파워순=================");

		list.sort(new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {

				return Integer.compare(o1.power, o2.power);
			}
		});
		list.forEach(new ConsumerImp());
	}
}
