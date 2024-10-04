package _18_영어단어관리_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	private Save save = null;
	private Search search = null;
	private Scanner in = null;

	public MainMenu() {
		in = new Scanner(System.in);
		init();
		while (true) {
			System.out.println("번호 선택");
			menu();
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				save.menu();
			} else if (num == 2) {
				search.menu();
			} else if (num == 3) {
				view();
			} else if (num == 9) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public void view() {
		String line = null;

		try (BufferedReader bReader = new BufferedReader(new FileReader("word.txt"))) {
			while ((line = bReader.readLine()) != null) {
				System.out.println("등록된 영어 : " + line);

			}
		} catch (IOException e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}

	public void menu() {
		System.out.println("1. 영어단어 저장");
		System.out.println("2. 영어단어 검색");
		System.out.println("3. 등록된 단어 전체보기");
		System.out.println("9. 종료");
	}

	private void init() {
		if (save == null) {
			save = new Save(this, in);
		}
		if (search == null) {
			search = new Search(this, in);
		}
	}
}
