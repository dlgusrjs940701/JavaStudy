package _13_미니프로젝트2;

import java.util.ArrayList;
import java.util.Scanner;

public class javaWord_main {

	ArrayList<javaWord_one> wordList = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	public javaWord_game game;

	javaWord_main() {

	}

	public void menu() {
		while (true) {
			System.out.println("-----자바워드-----");
			System.out.println("1. 단어등록");
			System.out.println("2. 전체보기");
			System.out.println("3. 삭제");
			System.out.println("4. 수정");
			System.out.println("5. 종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				add();
			} else if (num == 2) {
				search();
			} else if (num == 3) {
				delete();
			} else if (num == 4) {
				mod();
			} else if (num == 5) {
				break;
			}
		}
	}

	public int duplexCheck(String word) {
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).word.equals(word)) {
				return 1;
			}
		}
		return 0;
	}

	private void add() {
		// TODO Auto-generated method stub
		javaWord_one temp = new javaWord_one();
		System.out.println("영어단어를 입력해주세요.");
		String word = in.nextLine();
		if (duplexCheck(word) == 1) {
			System.out.println("해당 영어단어는 중복입니다.");
		} else {
			temp.word = word;
			System.out.println("그에 해당하는 한글 뜻을 입력하세요.");
			String mean = in.nextLine();
			temp.mean = mean;
			wordList.add(temp);
		}

		for (int i = 0; i < wordList.size(); i++) {
			wordList.get(i).word.equals(temp);
			System.out.println("등록되었습니다.");
		}
	}

	private void search() {
		// TODO Auto-generated method stub
		System.out.println("전체보기를 선택하셨습니다.");

		for (int i = 0; i < wordList.size(); i++) {
			wordList.get(i).prt();
		}
		if (wordList.size() == 0) {
			System.out.println("등록된 단어가 없습니다.");
		}
	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.println("삭제하고자 하는 영어단어를 입력해주세요.");
		String wordDelete = in.nextLine();

		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).word.equals(wordDelete)) {
				wordList.remove(i);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("해당하는 단어가 없습니다. 다시 입력하세요.");
				String wordDelete1 = in.nextLine();
				if (wordList.get(i).word.equals(wordDelete1)) {
					System.out.println("삭제되었습니다.");
				}
			}
		}
	}

	private void mod() {
		// TODO Auto-generated method stub
		System.out.println("영어단어와 한글 뜻을 수정하겠습니다. 변경하고자 하는 영어단어 먼저 입력해주세요.");
		String words = in.nextLine();
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).word.equals(words)) {
				System.out.println();
				System.out.println("이후 변경될 영어단어를 입력해주세요");
				wordList.get(i).word = in.nextLine();
				System.out.println();
				System.out.println("이후 변경될 한글 뜻을 입력해주세요");
				wordList.get(i).mean = in.nextLine();
				break;
			}
		}
	}
}
