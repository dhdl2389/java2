package java2prj1.day3.collection;

public class LGCalculator implements CalculatorI {

	@Override
	public int add(int a, int b) {
		System.out.println("LG");
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("LG");
		return a - b;
	}

}
