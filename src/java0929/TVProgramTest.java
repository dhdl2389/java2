package java0929;

import java.util.*;
import java.util.stream.Stream;

public class TVProgramTest {

	public static void main(String[] args) {

		ArrayList<TVProgram> list = new ArrayList<>();

		list.add(new TVProgram("무빙", "Drama", "액션"));
		list.add(new TVProgram("꼬꼬무", "Entertainment", "시사교양"));
		list.add(new TVProgram("나 홀로 집에", "Movie", "코믹"));
		list.add(new TVProgram("공조", "Movie", "액션"));
		list.add(new TVProgram("전국노래자랑", "MusicEntertainment", "노래"));

		for (TVProgram tvp : list) {
			System.out.println(tvp);
		}

		System.out.println("\n=========>forEach 사용출력\n");

		Stream<TVProgram> stream = list.stream();
		stream.forEach(program -> System.out.println(program));

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(" \n========= 추석 TV 프로그램 관리 프로그램 ========= ");
			System.out.println("1. 프로그램 목록 보기");
			System.out.println("2. 프로그램 추가");
			System.out.println("3. 프로그램 수정");
			System.out.println("4. 프로그램 삭제");
			System.out.println("5. 종료");
			System.out.print("메뉴를 선택하세요: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				displayPrograms(list);
				break;
			case 2:
				addProgram(list, sc);
				break;
			case 3:
				modifyProgram(list, sc);
				break;
			case 4:
				deleteProgram(list, sc);
				break;
			case 5:
				System.out.println(" 프로그램을 종료합니다. ");
				sc.close();
				System.exit(0);
			default:
				System.out.println(" 잘못된 선택입니다. 다시 선택하세요. ");
			}
		}
	}

	private static void displayPrograms(List<TVProgram> list) {
		System.out.println(" \n========= TV 프로그램 목록 ========= ");
		for (TVProgram tvp : list) {
			System.out.println(tvp);
		}
	}

	private static void addProgram(List<TVProgram> list, Scanner sc) {
		System.out.println(" \n========= TV 프로그램 추가 ========= ");
		System.out.print(" 프로그램 이름: ");
		String name = sc.nextLine();
		System.out.print(" 프로그램 종류: ");
		String category = sc.nextLine();
		System.out.print(" 프로그램 장르: ");
		String genre = sc.nextLine();

		TVProgram newProgram = new TVProgram(name, category, genre);
		list.add(newProgram);
		System.out.println(" 프로그램이 추가되었습니다. ");
	}

	private static void modifyProgram(List<TVProgram> list, Scanner scanner) {
		System.out.println(" \n========= TV 프로그램 수정 ========= ");
		System.out.print(" 수정할 프로그램 이름: ");
		String targetName = scanner.nextLine();

		for (TVProgram tvp : list) {
			if (tvp.getName().equals(targetName)) {
				System.out.print(" 새로운 TV 프로그램 이름: ");
				String newName = scanner.nextLine();
				System.out.print(" 새로운 TV 프로그램 종류: ");
				String newCategory = scanner.nextLine();
				System.out.print(" 새로운 TV 프로그램 장르: ");
				String newGenre = scanner.nextLine();

				tvp.setName(newName);
				tvp.setCategory(newCategory);
				tvp.setGenre(newGenre);
				System.out.println(" TV 프로그램이 수정되었습니다. ");
				return;
			}
		}

		System.out.println(" TV 프로그램을 찾을 수 없습니다. ");
	}

	private static void deleteProgram(List<TVProgram> list, Scanner scanner) {
		System.out.println(" \n=========> TV 프로그램 삭제 <========= ");
		System.out.print(" 삭제할 TV 프로그램 이름: ");
		String targetName = scanner.nextLine();

		for (TVProgram tvp : list) {
			if (tvp.getName().equals(targetName)) {
				list.remove(tvp);
				System.out.println("TV 프로그램이 삭제되었습니다.");
				return;
			}
		}

		System.out.println(" TV 프로그램을 찾을 수 없습니다. ");
	}
}
