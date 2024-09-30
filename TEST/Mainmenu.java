package 자바객체프로젝트;

import java.util.Scanner;

public class Mainmenu {

	jobMenu jm = null;
	companyMenu cm = null;
//	jobMain jm1=null;
//	employMent em1=null;
//	companyIm cI=null;
//	companyEm cE=null;

	Mainmenu() {
//		if (jm == null) {
//			jm = new jobMenu();
//		}
//		if (em == null) {
//			em = new companyMenu();
//		}
//		
//		menu();
	}

	public void menu() {
		Scanner S = new Scanner(System.in);
		while (true) {
			System.out.println("----- 구인 사이트 -----");
			System.out.println();
			System.out.println("1. 구인");
			System.out.println("2. 구직");
			System.out.println("9. 종료");
			int a = S.nextInt();
			S.nextLine();
			if (a == 1) {
				jm.menu();
			} else if (a == 2) {
				cm.menu();
			} else if (a == 9) {
				break;
			} else {
				System.out.println("다시 입력해주세요 !");
			}
		}
	}

}
