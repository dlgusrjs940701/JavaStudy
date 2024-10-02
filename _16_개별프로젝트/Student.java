package _16_개별프로젝트;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private final int MAXSTUDENT = 10;
	public static ArrayList<StudentOne> sList = new ArrayList<>();
	StudentOne s = null;

	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("<< 학생관리 >>");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 삭제");
			System.out.println("3. 학생 조회");
			System.out.println("4. 학생 전체보기");
			System.out.println("5. 종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				addStudent();
			} else if (num == 2) {
				deleteStudent();
			} else if (num == 3) {
				search();
			} else if (num == 4) {
				allview();
			} else if (num == 5) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}

		}
	}

	private void search() {
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 이름을 입력해주세요.");
		String sName = in.nextLine();
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getsName().equals(sName)) {
				sList.get(i).prt();
			} else {
				System.out.println("등록된 학생이 없습니다.");
			}
		}
	}

	private void addStudent() {
		Scanner in = new Scanner(System.in);
		if (sList.size() == MAXSTUDENT) {
			System.out.println("더이상 등록할 수 없습니다.");
		} else {
			StudentOne studentTemp = new StudentOne();
			System.out.println("학생의 ID를 입력해주세요.");
			String sId = in.nextLine();
			boolean id = s.setsId(sId);
			if (id == true) {
				System.out.println("해당 ID는 중복입니다.");
				return;
			} else {
				studentTemp.setsId(sId);
				System.out.println("학생의 이름을 입력해주세요.");
				String setsName = in.nextLine();
				studentTemp.setsName(setsName);
				System.out.println("학생의 전화번호를 입력해주세요.");
				String setsPhone = in.nextLine();
				studentTemp.setsPhone(setsPhone);
				System.out.println("학생의 학년을 등록해주세요.");
				int setsGrade = in.nextInt();
				studentTemp.setsGrade(setsGrade);
				sList.add(studentTemp);
				System.out.println("등록되었습니다.");

			}
		}

	}


	private void deleteStudent() {
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 ID를 입력해주세요.");
		String setsId = in.nextLine();
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getsId().equals(setsId)) {
				sList.remove(i);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}

	}

	private void allview() {
		System.out.println("학생 전체보기");
		for (StudentOne studentTemp : sList) {
			studentTemp.prt();
		}

	}

}
