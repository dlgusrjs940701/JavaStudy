package _10_미션;

import java.util.Scanner;

public class Parking_manager {
	Car_obj[] carList = new Car_obj[7];
	Scanner in = new Scanner(System.in);

	Parking_manager() {
		while (true) {
			System.out.println();
			System.out.println("주차 등록 관리자");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			System.out.println(" 선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + " 번을 선택하셨습니다");
			System.out.println();
			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				check();
			} else if (selNum == 3) {
				allList();
			} else if (selNum == 4) {
				delete();
			} else {
				break;
			}
		}
		in.close();
	}

	public void add() {
		System.out.println("주차 차량을 등록하겠습니다. 자동차 번호를 입력해주세요");
		Car_obj car = new Car_obj();
		car.number = in.nextLine();
		System.out.println();
		System.out.println("자동차의 소유자 성함을 입력해주세요");
		car.name = in.nextLine();
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = car;
				break;
			}
		}
	}

	public void check() {
		System.out.println("현재 주차된 차량들 중 해당차량을 조회합니다. 자동차 번호를 입력하세요.");
		String carCheck = in.nextLine();

		for (int i = 0; i < carList.length; i++) {
			if (carList[i].number.equals(carCheck)) {
				System.out.println("조회하신 차량의 정보입니다.");
				System.out.println();
				carList[i].prt();
				break;
			}
		}
	}

	public void allList() { // 메서드 정의
		System.out.println("주차된 차량 전체 보기");
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null) {
				System.out.println();
				carList[i].prt();
			}
		}
	}

	public void delete() {
		System.out.println("주차된 차량의 정보를 삭제하겠습니다. 자동차 번호를 입력해주세요.");
		String carDelete = in.nextLine();

		for (int i = 0; i < carList.length; i++) {
			if (carList[i].number.equals(carDelete)) {
				carList[i] = null;
				System.out.println("차량이 삭제되었습니다.");
				break;
			}
		}
	}
}
