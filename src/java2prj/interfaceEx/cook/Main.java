package java2prj.interfaceEx.cook;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) { 
 
		//Cook형을 담을 수 있는 ArrayList를 준비한다
		ArrayList<Cook> list = new ArrayList<Cook>();
		  
		// Cook을 상속받았으므로 각 각의 요리사 클래스를 담을 수 있다
		EachCookClass(list);
		 
 		// 요리사별로 ArrayList 준비하기
		ArrayList<한식가능한> 한식요리사 = new ArrayList<한식가능한>();
		ArrayList<중식가능한> 중식요리사 = new ArrayList<중식가능한>();
		ArrayList<양식가능한> 양식요리사 = new ArrayList<양식가능한>();

		
		// 요리사종류별로 목록을 구성한다 +  출력
		CategoryList(list, 한식요리사, 중식요리사, 양식요리사);

		
		// 랜덤한 값 얻어오기
		int random = (int) (Math.random() * 3); // 0~2; 
		
		
		//선택한 요리사종류 출력하기
		String selectedKind = selectedCookPrint(random);

		 
		//선택된 요리사종류  중에서 한 명의 요리사 선택하기 
		int randomRange = 0;
		int finalOne;
		Cook fianlCook = null;

		switch (selectedKind) {
		case "한식가능한":
			case1(한식요리사);
			break;

		case "중식가능한":
			case2(중식요리사);
			break;

		case "양식가능한":
			case3(양식요리사);
			break;
		}

	}
///////////////////////////////////////////
	public static String selectedCookPrint(int random) {
		String[] kinds = { "한식가능한", "중식가능한", "양식가능한" };
		String selectedKind = kinds[random];
		System.out.println("==========>선택된 요리사 kind  ====>" + selectedKind);
		return selectedKind;
	}

	public static void EachCookClass(ArrayList<Cook> list) {
		//list.add(new ArraylistEx김민규("김민규"));
		//list.add(new ChineseCook("chineseCook"));
		//list.add(new cook이정훈("이정훈"));
		//list.add(new HJHCook("HJHCook"));
		//list.add(new juntae("표준태"));
		//list.add(new kbj("김병진"));
		list.add(new kjy("김재열"));
		//list.add(new ly("이윤 "));
		//list.add(new lyj("이윤정"));
		//list.add(new myCook("myCook"));
		//list.add(new Najeong("문나정"));		 
		//list.add(new Pasta("조은경 "));
		//list.add(new Seoyejin("서예진"));
		//list.add(new Taemin("박태민"));
		//list.add(new 김민지요리사("김민지요리사 "));
	}

	public static void case3(ArrayList<양식가능한> 양식요리사) {
		int randomRange;
		int finalOne;
		Cook fianlCook;
		for (양식가능한 cook : 양식요리사) {
			System.out.println(cook);
		}
		randomRange = 양식요리사.size();
		System.out.println("randomRange="+ randomRange);
		finalOne = (int) (Math.random() * randomRange);
		fianlCook = (Cook) 양식요리사.get(finalOne);
		System.out.println("====>최종선발 3초후공개");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fianlCook);
	}

	public static void case2(ArrayList<중식가능한> 중식요리사) {
		int randomRange;
		int finalOne;
		Cook fianlCook;
		for (중식가능한 cook : 중식요리사) {
			System.out.println(cook);
		}
		randomRange = 중식요리사.size();
		System.out.println("randomRange="+ randomRange);
		finalOne = (int) (Math.random() * randomRange);
		fianlCook = (Cook) 중식요리사.get(finalOne);
		
		System.out.println("====>최종선발 3초후 공개");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fianlCook);
	}

	public static void case1(ArrayList<한식가능한> 한식요리사) {
		int randomRange;
		int finalOne;
		Cook fianlCook;
		for (한식가능한 cook : 한식요리사) {
			System.out.println(cook);
		}
		 randomRange = 한식요리사.size();
		System.out.println("randomRange="+ randomRange);
		finalOne = (int) (Math.random() * randomRange);
		fianlCook = (Cook) 한식요리사.get(finalOne);
		System.out.println("====>최종선발 3 초후 공개");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fianlCook);
	}

	public static void CategoryList(ArrayList<Cook> list, ArrayList<한식가능한> 한식요리사, ArrayList<중식가능한> 중식요리사,
			ArrayList<양식가능한> 양식요리사) {
		for (Cook cook : list) {
			if (cook instanceof 한식가능한) {
				한식요리사.add((한식가능한) cook);
			} else if (cook instanceof 중식가능한) {
				중식요리사.add((중식가능한) cook);
			} else if (cook instanceof 양식가능한) {
				양식요리사.add((양식가능한) cook);
			}
		}

		System.out.println("--한식 요리사 입니다--");
		System.out.println(한식요리사);

		System.out.println("--중식 요리사 입니다--");
		System.out.println(중식요리사);

		System.out.println("--양식 요리사 입니다--");
		System.out.println(양식요리사);
	}

}
