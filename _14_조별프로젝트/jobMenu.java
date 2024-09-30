package _14_조별프로젝트;

import java.util.ArrayList;
import java.util.Scanner;

public class jobMenu {
	jobMain jm = null;
	job_Manage jM = null;
	

	ArrayList<jobMenu> ItMenu = new ArrayList<>();
	ArrayList<jobMenu> FacMenu = new ArrayList<>();
	ArrayList<jobMenu> ServiceMenu = new ArrayList<>();
	ArrayList<jobMenu> businessMenu = new ArrayList<>();
	ArrayList<jobMenu> PublicMenu = new ArrayList<>();

	public void ArrayList() {
	}

	public void jobMenu() {
		Scanner S = new Scanner(System.in);
		jobMenu memberTemp = new jobMenu();
		System.out.println("1. [IT] ");
		System.out.println("2. [제조업] ");
		System.out.println("3. [서비스업] ");
		System.out.println("4. [영업] ");
		System.out.println("5. [공기관] ");
		int num = S.nextInt();
		S.nextLine();
//		for(int i=0;i<jm.memberList.size();i++) {
			if (num == 1) {
				ItMenu.add(memberTemp);
				System.out.println("등록되었습니다.");
				System.out.println(ItMenu.get(0));
			} else if (num == 2) {
				FacMenu.add(memberTemp);
				System.out.println("등록되었습니다.");
			} else if (num == 3) {
				ServiceMenu.add(memberTemp);
				System.out.println("등록되었습니다.");
			} else if (num == 4) {
				businessMenu.add(memberTemp);
				System.out.println("등록되었습니다.");
			} else if (num == 5) {
				PublicMenu.add(memberTemp);
				System.out.println("등록되었습니다.");
			} else {
				System.out.println("다시 시도해주세요.");
			}
//		}
	}

	public void view() {
		System.out.println("희망 직종 : ");
	}
}
