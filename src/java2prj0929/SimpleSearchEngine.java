package java2prj0929;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleSearchEngine {
	private static List<String> searchableItems = new ArrayList<>();

	static {
		searchableItems.add("자바");
		searchableItems.add("프로그래밍");
		searchableItems.add("컴퓨터");
		searchableItems.add("알고리즘");
	}

	public static List<String> search(String query) {
		List<String> results = new ArrayList<>();

		// 입력 쿼리와 각 항목을 소문자로 변환하여 비교
		String lowercaseQuery = query.toLowerCase();
		for (String item : searchableItems) {
			if (item.toLowerCase().contains(lowercaseQuery)) {
				results.add(item);
			}
		}

		return results;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("검색어를 입력하세요: ");
		String userInput = scanner.nextLine(); // 사용자 입력

		List<String> searchResults = search(userInput);

		if (searchResults.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("검색 결과:");
			for (String result : searchResults) {
				System.out.println(result);
			}
		}
		scanner.close();
	}
}