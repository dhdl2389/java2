package java2.day4.reflect;

public class 객체생성하기1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		// 1. 클래스 정보 얻어오기
		Class clazz = Member.class;

		Member member = (Member) clazz.newInstance();

		member.method2(3);

	}
}
