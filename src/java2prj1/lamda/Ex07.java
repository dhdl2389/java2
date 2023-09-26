package java2prj1.lamda;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] MoneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		String[] MoneyunitK = { "오만 원", "만 원", "오천 원", "천 원", "오백 원", "백 원", "오십 원", "십 원" };

		System.out.print("금액을 입력하세요: ");
		int amount = scanner.nextInt();

		for (int i = 0; i < MoneyUnit.length; i++) {
			int count = amount / MoneyUnit[i];
			if (count > 0) {
				System.out.println(MoneyunitK[i] + ": " + count + "개");
				amount %= MoneyUnit[i];
			}
		}

	}
}
