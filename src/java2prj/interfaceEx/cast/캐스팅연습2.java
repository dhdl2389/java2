package java2prj.interfaceEx.cast;

public class 캐스팅연습2 {

	public static void main(String[] args) {
		Score s = new Score("홍길동",100,90);
		Score s2 = new Score("김길동",50,95);
		
		int result = s.compareTo(s2);
		System.out.println(result);
	}

}
