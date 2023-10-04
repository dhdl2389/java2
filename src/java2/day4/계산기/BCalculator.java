package java2.day4.계산기;

public class BCalculator implements Calculator {

	@Override
	public int add(int a, int b) {

		System.out.println("B 계산기");

		return a + b;
	}

}
