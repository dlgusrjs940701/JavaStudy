package _13_미니프로젝트2;

import java.util.Scanner;

public class mainMenu {
	javaWord_main word = null;
	javaWord_game game = null;

	mainMenu() {
		if (word == null) {
			word = new javaWord_main();
		}
		if (game == null) {
			game = new javaWord_game();
		}
		word.game = game;
		
		menu();
	}
	
	public void menu() {
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.println("-----자바월드-----");
			System.out.println("1. 영어단어관리");
			System.out.println("2. 단어게임");
			System.out.println("3. 종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				word.menu();
			} else if (num == 2) {
				game.menu();
			} else if (num == 3) {
				break; 
			}
		}
	}
}
