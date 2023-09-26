package ToyBoxGeneric;

public class FoodTest {
	public static void main(String[] args) {

		FoodPrinter<Rice> f1 = new FoodPrinter<>();
		f1.setFood(new Rice());
		f1.print();

		FoodPrinter<Pasta> f2 = new FoodPrinter<>();
		f2.setFood(new Pasta());
		f2.print();

		FoodPrinter<Pizza> f3 = new FoodPrinter<>();
		f3.setFood(new Pizza());
		f3.print();
	}
}
