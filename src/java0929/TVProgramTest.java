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
	}
}
