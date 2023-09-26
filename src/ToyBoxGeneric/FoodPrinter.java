package ToyBoxGeneric;

public class FoodPrinter<T extends Food> {

	private T Food;

	public T getFood() {
		return Food;
	}

	public void setFood(T Food) {
		this.Food = Food;
	}

	public void print() {
		System.out.println("Food:" + " " + Food);
	}

}
