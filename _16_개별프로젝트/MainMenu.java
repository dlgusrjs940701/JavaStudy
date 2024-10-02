package _16_개별프로젝트;

import java.util.Scanner;

public class MainMenu {
	Student S=null;
	Class C=null;
	
	MainMenu(){
	if(S==null) {
		S=new Student();
	}
	if(C==null) {
		C=new Class();
		menu();
	}
	
	
	}

	private void menu() {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.println("<<< 수강신청 프로그램 >>>");
			System.out.println("1. 학생관리");
			System.out.println("2. 교과목관리");
			System.out.println("3. 프로그램 종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				S.menu();
			} else if (num == 2) {
				C.menu();
			} else if (num == 3) {
				break; 
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
