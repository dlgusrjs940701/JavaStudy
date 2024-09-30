package 자바객체프로젝트;

import java.util.Scanner;

public class companyMenu {

	companyIm ci = null;
	companyEm ce = null;



	companyMenu() {

	}

	public void menu() {
		Scanner S = new Scanner(System.in);
		while (true) {
			System.out.println("----- 구인중인 회사 -----");
			System.out.println();
			System.out.println("1. 구인중인 회사 관리");
			System.out.println("2. 구인완료 회사 관리");
			System.out.println("9. 종료");
			int a = S.nextInt();
			S.nextLine();
			if (a == 1) {
				ci.menu();
			} else if (a == 2) {
				ce.menu();
			} else if (a == 9) {
				break;
			} else {
				System.out.println("다시 입력해주세요 !");
			}
		}
	}

}
