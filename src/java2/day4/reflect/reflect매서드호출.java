package java2.day4.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect매서드호출 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Member m = new Member();
		m.printInfo(); // m.printInfo(m); --> this

		Class clazz = Class.forName("java2.day4.reflect.Member");

		// 매서드 호출
		// invoke

		Method method = clazz.getDeclaredMethod("printInfo");
		method.invoke(m);
		
		Method method2 =clazz.getDeclaredMethod("method2", int.class);
		method2.invoke(m , 3);

	}
}
