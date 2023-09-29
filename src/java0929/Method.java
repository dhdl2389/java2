package java0929;

public class Method {
	public void Method1() {
		System.out.println("메롱");
	}

	public void Method2(int su) {
		System.out.println(su + "웃자");
	}

	public int[] Method3() {
		System.out.println(" 배열을 리턴해야 되는군!! 옛다 배열 ");
		int[] r = new int[] { 9, 8, 7 }; // int r = {9,8,7} 과 같다
		return r;
	}

	public void Method4(int num1, int num2) {
		System.out.println("더 큰 숫자는 " + Math.max(num1, num2) + "입니다.");
	}

	public void Method5(int num1, int num2) {
		System.out.println(Math.pow(num1, num1));
	}

	public boolean Method6(boolean flag) {
		return !flag;
	}

	public int Method7(int a, int b) {
		return a + b;
	}

	public int Method8(int x, int y) {
		return x * y;
	}

	public String Method9(String name) {
		return name.toUpperCase();
	}

	public void Method10(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("총 합 : " + sum);
	}
}
