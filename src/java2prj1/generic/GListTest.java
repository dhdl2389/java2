package java2prj1.generic;

public class GListTest {
	public static void main(String[] args) {

		GList<Score> list = new GList<>();

		list.add(new Score("이정훈", 100, 99));
		list.add(new Score("이윤정", 99, 100));

		for (int i = 0; i < list.size(); i++) {
			Score s = list.get(i);
			System.out.println(s);
			System.out.println(s.getEng());
		}

	}
}
