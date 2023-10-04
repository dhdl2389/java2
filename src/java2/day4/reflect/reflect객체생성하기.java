package java2.day4.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reflect객체생성하기 {

	public static void main(String[] args)
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		String className = "";

		BufferedReader br = new BufferedReader(new FileReader("src/java2/day4/reflect/config.txt"));

		String line = br.readLine();
		String[] info = line.split("=");
		String key = info[0];
		String value = info[1];

		System.out.println(key);
		System.out.println(value);

		className = value;

		Class clazz = Class.forName(className);
		Member member = (Member) clazz.newInstance();

		member.method2(2);
	}
}
