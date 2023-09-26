package java2prj1.lamda;

import java.util.Scanner;

public class Runnable학생 {
	public static void main(String[] args) {
		Runnable kjy = () -> {

			// 실행하고 싶은 코드
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i * j);
				}
			}
		};
		kjy.run();

		Runnable r4 = ()-> {
			System.out.println("코딩은 어려워");
		
			System.out.println("╭┈┈┈┈╯   ╰┈┈┈╮\r\n"
					+ "\r\n"
					+ "╰┳┳╯    ╰┳┳╯\r\n"
					+ "\r\n"
					+ "N 　    N\r\n"
					+ "\r\n"
					+ "○       ○\r\n"
					+ "   ╰┈┈╯\r\n"
					+ " O ╭━━━━━╮　 O\r\n"
					+ "    ┈┈┈┈\r\n"
					+ "　o     　　 o\r\n"
					+ "");
		
			};
		r4.run();
		
		Runnable juntae = () ->System.out.println("다들 화이팅 ฅʕ•.•ʔฅ");
		
		juntae.run();
		
		
		Runnable bj = ()->{
			int c = 3;
			for(int i =1; i<=4; i++) {
				System.out.println(c+i);
			}
		};
		bj.run();
		
		
		Runnable insertnm = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요>");
			String name = sc.nextLine();
			System.out.println("너의 이름은 : " + name + "!");
		};
		
		insertnm.run();
	}
}
