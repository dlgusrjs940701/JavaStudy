package _16_개별프로젝트;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
	private ArrayList<ClassOne> cList = new ArrayList<>();
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("<< 학생관리 >>");
			System.out.println("1. 교과목 등록");
			System.out.println("2. 교과목 전체리스트");
			System.out.println("3. 종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				addClass();
			} else if (num == 2) {
				viewClass();
			} else if (num == 3) {
				break;
			} else {
				System.out.println("다시 입렫해주세요.");
			}

		}

	}

	private void addClass() {
		ClassOne classTemp = new ClassOne();
		Scanner in = new Scanner(System.in);
		System.out.println("과목명을 입력해주세요.");
		String setClassName = in.nextLine();
		classTemp.setClassName(setClassName);
		System.out.println("강의실을 입력해주세요.");
		String classRoom = in.nextLine();
		classTemp.setClassRoom(classRoom);
		System.out.println("담당교수명을 입력해주세요.");
		String classTeacher = in.nextLine();
		classTemp.setClassTeacher(classTeacher);
		cList.add(classTemp);
		System.out.println("등록되었습니다.");

	}

	private void viewClass() {
		System.out.println("교과목 전체리스트");
		for (ClassOne classTemp : cList) {
			classTemp.prt();
		}
	}

}
