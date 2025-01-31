package 자바객체프로젝트;

//import java.util.ArrayList;
import java.util.Scanner;

public class employMent {

	jobMain jm = null;

	employMent() {

	}

	public void menu() {
		Scanner S = new Scanner(System.in);
		while (true) {
			System.out.println("<<< 취업된 회원 관리 >>>");
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
		for (employMent_Manage memberTemp : jm.employList) {
			memberTemp.view();
		}
	}

	private void memberDelete() {
		Scanner S = new Scanner(System.in);
		System.out.println("삭제를 선택하셨습니다. 회원의 ID를 입력해주세요.");
		String mId = S.nextLine();

		for (int i = 0; i < jm.employList.size(); i++) {
			if (jm.employList.get(i).mId.equals(mId)) {
				System.out.println("회원의 이름도 입력해주세요.");
				String mName = S.nextLine();
				if (jm.employList.get(i).mName.equals(mName)) {
					jm.employList.remove(i);
					System.out.println("삭제되었습니다.");
					break;
				}
			}
		}
	}

}
