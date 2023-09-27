package java2prj1.day3.collection;

import java.util.Scanner;

public class SimplePro {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 프로그램");

		System.out.println("첫번째 수");
		int su = sc.nextInt();

		System.out.println("두번째 수");
		int su2 = sc.nextInt();

		CalculatorI cal = new LGCalculator();

		int result = cal.add(su, su2);
		System.out.println(result);

	}
}
