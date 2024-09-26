package _14_조별프로젝트;

import java.util.Scanner;

public class MainMenu {
	
	jobMain jm=null;
	employMent em=null;
	
	MainMenu(){
		if(jm==null) {
			jm=new jobMain();
		}
		if(em==null) {
			em=new employMent();
		}
		em.jm = jm;
		menu();
	}

	public void menu() {
		Scanner S=new Scanner(System.in);
		while(true) {
			System.out.println("----- 구인 사이트 -----");
			System.out.println();
			System.out.println("1. 구직중인 회원 관리");
			System.out.println("2. 취업된 회원 관리");
			System.out.println("9. 종료");
			int a=S.nextInt();
			S.nextLine();
			if(a==1) {
				jm.menu();
			}else if(a==2) {
				em.menu();
			}else if(a==9) {
				break;
			}else {
				System.out.println("다시 입력해주세요 !");
			}
		}
	}
	
}
