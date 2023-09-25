package java2prj1.generic;

import java.util.*;
import java.util.function.Consumer;

public class 와일드문자로제한하기 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		print(list);
		print2(list);
		//
		//
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("one");
		list2.add("two");
		list2.add("three");

		// print(list2); => 오류가 발생한다 오로지 String 형만 가능 Object 안됨
		print2(list2);
		//
		//
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("one3");
		list3.add("two3");
		list3.add("three3");

		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
/////////////////////////////////////////////////////////////////////////////
		// 소비하다의 의미 갖고있음( 입력이 반환이 없음 )
		class aaa implements Consumer<String> {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		}
		System.out.println("============출력============");
		list3.forEach(new aaa());

///////////////////////////////////////////////////////////////////////////
		// 2.
		list3.forEach(new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		// 구현할 매서드가 하나뿐인 인턴페이스를 functional Interface라고 함
		// => 람다식으로 표현 가능
		// 3.
		System.out.println("============람다식============");
		list3.forEach(t -> System.out.println(t));
	}

	public static void print(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	// 매서드 인자에서 제네릭 제한하기
	// ? super String
	// ? extends String

	public static void print2(ArrayList<? super String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
