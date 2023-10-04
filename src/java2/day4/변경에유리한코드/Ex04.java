package java2.day4.변경에유리한코드;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ex04 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

		Animal animal = getAnimal();
		animal.bark();

		Animal animal2 = getAnimal();
		animal2.bark();

		Animal animal3 = getAnimal();
		animal3.bark();

	}

	private static Animal getAnimal() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		Properties p = new Properties();
		p.load(new FileReader("src/java2/day4/변경에유리한코드/config.txt"));
		
		String className = p.getProperty("animal");
		Class clazz = Class.forName(className);
		Animal animal = (Animal) clazz.newInstance();

		return animal;

	}

}
