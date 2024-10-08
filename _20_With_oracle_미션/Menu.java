package _20_With_oracle_미션;

import java.util.Scanner;

public class Menu {
	private FoodManage F = null;
	private FoodOne F1 = null;

	Menu() {
		if (F == null) {
			F = new FoodManage();
		}
		if (F1 == null) {
			F1 = new FoodOne();
		}
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println(">>> 내가 좋아하는 음식 관리");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 삭제");
			System.out.println("3. 음식 수정");
			System.out.println("4. 음식 전체보기");
			System.out.println("9. 뒤로");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				F.add();
			} else if (selNum == 2) {
				F.delete();
			} else if (selNum == 3) {
				F.mod();
			} else if (selNum == 4) {
				F.list();
			} else if (selNum == 9) {
				break;
			} else {
				System.out.println("다시 입력");
			}
		}
	}
}
