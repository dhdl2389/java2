package java2prj1.lamda;

public class Test {

	public static void main(String[] args) {
		// 이름있는 클래스 생성하기
		B a = new B();
		int result = a.add(5, 3);

		// CalculatorI b = new CalculatorI() {};

		// 2. 익명클래스 작성 한 다음 사용하기
		CalculatorI b = new CalculatorI() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}

			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		};

		int result2 = b.add(5, 2);

		// 람다식은 사용이 불가하다
		// 추상매서가드가 한 개인 인터페이스만 람다식이 가능하다

	}

}
