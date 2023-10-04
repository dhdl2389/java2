package java2.day4.변경에유리한코드;

public class Ex03 {

	public static void main(String[] args) {

		Animal animal = getAnimal();
		animal.bark();

		Animal animal2 = getAnimal();
		animal2.bark();

		Animal animal3 = getAnimal();
		animal3.bark();
	}

	private static Animal getAnimal() {

		//return new Cat();
		return new Dog();
	}

}
