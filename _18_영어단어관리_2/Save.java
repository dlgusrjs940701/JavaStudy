package _18_영어단어관리_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import _18_영어단어관리.word;

public class Save {
	private MainMenu mm = null;
	private Scanner in = null;

	public Save(MainMenu mm, Scanner in) {
		this.mm = mm;
		this.in = in;
	}


	public void menu() {
		in = new Scanner(System.in);

		System.out.println("저장할 내용을 입력하세요: ");
		String temp = in.nextLine(); // 사용자 입력 받기

		// 파일에 내용 저장하기
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("word.txt", true))) {
			bWriter.write(temp); // 입력 내용 파일에 저장
			bWriter.newLine(); // 줄바꿈 추가
			System.out.println("저장되었습니다.");
			System.out.println(word.txt);
		} catch (IOException e) {
			System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
		}
//		mm.menu();
	}

}
