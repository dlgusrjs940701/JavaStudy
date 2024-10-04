package _18_영어단어관리_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Search {
	private MainMenu mm = null;
	private Scanner in = null;

	public Search(MainMenu mm, Scanner in) {
		this.mm = mm;
		this.in = in;
	}

	public void menu() {
		in = new Scanner(System.in);

		System.out.println("검색할 내용을 입력하세요.");
		String temp = in.nextLine();

		try (BufferedReader bReader = new BufferedReader(new FileReader("word.txt"))) {
			String line = null;
			boolean find = false;

			while ((line = bReader.readLine()) != null) {
				if (line.equals(temp)) {
					System.out.println("찾으신 영어 : " + line);
					find = true;
					break;
				}
			}
			if (!find) {
				System.out.println("찾을 수 없음.");
			}

		} catch (IOException e) {
			System.out.println("오류 : " + e.getMessage());
		}
//		mm.menu();
	}

}
