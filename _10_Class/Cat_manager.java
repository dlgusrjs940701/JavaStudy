package _10_Class;

import java.util.Scanner;

public class Cat_manager {
	Cat_obj[] clist = new Cat_obj[5];
	Scanner in = new Scanner(System.in);

	Cat_manager() {
		while (true) {
			System.out.println("고양이 관리자");
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 수정");
			System.out.println("4. 전체보기");
			System.out.println(" 선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + "을 선택함");
			if (selNum == 1) {
				add(); // 메서드 호출
			} else if (selNum == 2) {

			} else if (selNum == 3) {

			} else if (selNum == 4) {
				allList(); // 메서드 호출
			} else {
				break;
			}
		}
	}

	public void add() { // 메서드 정의
		Scanner in = new Scanner(System.in);
		System.out.println("고양이 등록");
		Cat_obj cat = new Cat_obj();
		System.out.println("고양이 이름을 입력");
		cat.name = in.nextLine();
		for (int i = 0; i < clist.length; i++) {
			if (clist[i] == null) {
				clist[i] = cat;
				break;
			}
		}
		in.close();
	}

	public void allList() { // 메서드 정의
		System.out.println("고양이 전체 보기");
		for (int i = 0; i < clist.length; i++) {
			if (clist[i] != null) {
				clist[i].prt();
				break;
			}
		}
	}
}
