package ToyBoxGeneric;

public class MyToyTest {

	public static void main(String[] args) {

		ToyBox<Toy> arr = new ToyBox<>();

		Toy a = new Toy("lego", "99999");
		Toy b = new Toy("Secret Jouju", "77777");
		Toy c = new Toy("Kongsuni", "120000");

		arr.add(a);
		arr.add(b);
		arr.add(c);

		for (int i = 0; i < arr.size(); i++) {
			Toy t = arr.get(i);
			System.out.println(t);
		}
		
	}

}
