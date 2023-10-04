package java2.day4.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import java2.day4.변경에유리한코드.Animal;

public class CookTest {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, InstantiationException, IllegalAccessException, IOException {
		Cook cook = getCook();
		cook.Bbulbaek();
		cook.Bulgogi();
		cook.Ssambab();

	}

	private static Cook getCook() throws ClassNotFoundException, FileNotFoundException, IOException,
			InstantiationException, IllegalAccessException {
		Properties p = new Properties();
		p.load(new FileReader("src/java2/day4/test/config.txt"));

		String className = p.getProperty("cook");
		Class clazz = Class.forName(className);
		Cook cook = (Cook) clazz.newInstance();

		return cook;
	}
}
