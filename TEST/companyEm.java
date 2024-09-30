package 자바객체프로젝트;

import java.util.Scanner;

public class companyEm {

	companyIm cm = null;

	companyEm() {

	}

	public void menu() {
		Scanner S = new Scanner(System.in);
		while (true) {
			System.out.println("<<< 구인완료된 회사 관리 >>>");
			System.out.println("1. 전체보기");
			System.out.println("2. 삭제");
			System.out.println("3. 뒤로");
			int a = S.nextInt();
			S.nextLine();
			if (a == 1) {
				allView();
			} else if (a == 2) {
				memberDelete();
			} else if (a == 3) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private void allView() {
		System.out.println("전체보기를 선택하셨습니다.");
		for (companyEnd cpTemp : cm.employList) {
			cpTemp.view();
		}
	}

	private void memberDelete() {
		Scanner S = new Scanner(System.in);
		System.out.println("삭제를 선택하셨습니다. 회사의 법인ID를 입력해주세요.");
		String cId = S.nextLine();

		for (int i = 0; i < cm.employList.size(); i++) {
			if (cm.employList.get(i).cId.equals(cId)) {
				System.out.println("회사의 이름도 입력해주세요.");
				String cName = S.nextLine();
				if (cm.employList.get(i).cName.equals(cName)) {
					cm.employList.remove(i);
					System.out.println("삭제되었습니다.");
					break;
				}
			}
		}
	}

}
