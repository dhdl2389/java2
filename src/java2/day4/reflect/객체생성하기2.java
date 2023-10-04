package java2.day4.reflect;

public class 객체생성하기2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		Member m = new Member();

		Class clazz = m.getClass();

		Member member = (Member) clazz.newInstance();
		
		m.method2(2);

	}
}
