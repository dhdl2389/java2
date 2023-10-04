package java2prj0929;

import java.util.*;
import java.util.stream.Stream;

public class TVProgramTest {
	public static String RESET = "\u001B[0m";
	public static String RED = "\u001B[31m";
	public static String GREEN = "\u001B[32m";
	public static String YELLOW = "\u001B[33m";
	public static String Blue = "\u001B[34m";

	public static void main(String[] args) {
		System.out.println(RED + "이 텍스트는 빨간색입니다." + RESET);
		System.out.println(GREEN + "이 텍스트는 녹색입니다." + RESET);
		System.out.println(YELLOW + "이 텍스트는 노란색입니다." + RESET);
		System.out.println(Blue + "이 텍스트는 파란색입니다." + RESET);

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
			System.out.println(YELLOW + "\n**************************************************" + RESET);
			System.out.println(YELLOW + " *                추석TV 채널 관리 프로그램            *" + RESET);
			System.out.println(YELLOW + "**************************************************" + RESET);
			System.out.println(GREEN + "\n1. 프로그램 목록 보기" + RESET);
			System.out.println(GREEN + "2. 프로그램 추가" + RESET);
			System.out.println(GREEN + "3. 프로그램 수정" + RESET);
			System.out.println(GREEN + "4. 프로그램 삭제" + RESET);
			System.out.println(GREEN + "5. 종료" + RESET);
			System.out.print(RED + "\n메뉴를 선택하세요: " + RESET);

			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				showPrograms(list);
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
				System.out.println(" 추석TV 채널 관리 프로그램을 종료합니다. ");
				sc.close();
				System.exit(0);
			default:
				System.out.println(" 잘못된 선택입니다. 다시 선택하세요. ");
			}
		}
	}

	public static void showPrograms(List<TVProgram> list) {
		System.out.println(" \n========= TV 프로그램 목록 ========= ");
		for (TVProgram tvp : list) {
			System.out.println(tvp);
		}
	}

	public static void addProgram(List<TVProgram> list, Scanner sc) {
		System.out.println(" \n========= TV 프로그램 추가 ========= ");

		while (true) {
			System.out.print(" 프로그램 이름: ");
			String name = sc.nextLine().trim();

			if (name.length() >= 10) {
				System.out.println("TV 프로그램의 이름은 최대 10글자까지 입력 가능합니다. 다시 입력해주세요 ");
			} else {

				System.out.print(" TV 프로그램 종류: ");
				String category = sc.nextLine().trim();

				System.out.print(" TV 프로그램 장르: ");
				String genre = sc.nextLine().trim();

				TVProgram newProgram = new TVProgram(name, category, genre);
				list.add(newProgram);
				System.out.println(" TV 프로그램이 추가되었습니다. ");
				break;
			}
		}
	}

	public static void modifyProgram(List<TVProgram> list, Scanner sc) {
		System.out.println(" \n========= TV 프로그램 수정 ========= ");
		System.out.print(" 수정할 프로그램 이름: ");
		String modifyName = sc.nextLine();

		for (TVProgram tvp : list) {
			if (tvp.getName().equals(modifyName)) {
				System.out.print(" 새로운 TV 프로그램 이름: ");
				String newName = sc.nextLine();

				System.out.print(" 새로운 TV 프로그램 종류: ");
				String newCategory = sc.nextLine();

				System.out.print(" 새로운 TV 프로그램 장르: ");
				String newGenre = sc.nextLine();

				tvp.setName(newName);
				tvp.setCategory(newCategory);
				tvp.setGenre(newGenre);

				System.out.println(" TV 프로그램이 수정되었습니다. ");
				return;
			}
		}

		System.out.println(" TV 프로그램을 찾을 수 없습니다. ");
	}

	public static void deleteProgram(List<TVProgram> list, Scanner sc) {
		System.out.println(" \n=========> TV 프로그램 삭제 <========= ");

		System.out.print(" 삭제할 TV 프로그램 이름: ");
		String targetName = sc.nextLine();

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
