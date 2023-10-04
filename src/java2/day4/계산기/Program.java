package java2.day4.계산기;

import java.util.Scanner;

/* Program    
 * Calculator - interface (ACalculator, BCalculator)
 * 외부 설정 파일을 이용해서 A -> B로 코드이 변경없이 반환할 수 있도록 한다.
 * */
public class Program {

	int su1;
	int su2;
	Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	void run() {
		// 동작코드
		// 두 수를 입력받아서 덧셈을 하고 출력하기
		Scanner sc = new Scanner(System.in);
		this.su1 = sc.nextInt();
		this.su2 = sc.nextInt();

		int result = calculator.add(su2, su1);
		System.out.println(result);
	}

	public static void main(String[] args) {
		Program p = new Program();
		p.setCalculator(new BCalculator());
		p.run();
	}

}
