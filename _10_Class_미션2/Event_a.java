package _10_Class_미션2;

import java.util.Scanner;

public class Event_a {
	Event[] eventList = new Event[10];
	Scanner in = new Scanner(System.in);

	Event_a() {
		while (true) {
			System.out.println("--------이벤트--------");
			System.out.println();
			System.out.println("1. 이벤트 등록");
			System.out.println("2. 이벤트 조회");
			System.out.println("3. 이벤트 전체보기");
			System.out.println("4. 종료");
			System.out.println(" 선택 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + " 번을 선택하셨습니다");
			System.out.println();
			if (selNum == 1) {
				add_event();
			} else if (selNum == 2) {
				search_event();
			} else if (selNum == 3) {
				allList_event();
			} else {
				break;
			}
		}
	}

	private void search_event() {
		// TODO Auto-generated method stub
		System.out.println("현재 등록된 이벤트 중 조회할 이벤트 제목을 입력해주세요.");
		String eventCheck = in.nextLine();

		for (int i = 0; i < eventList.length; i++) {
			if (eventList[i].eName.equals(eventCheck)) {
				System.out.println("조회하신 이벤트의 정보입니다.");
				System.out.println();
				eventList[i].prt();
				break;
			}
		}
	}

	private void allList_event() {
		// TODO Auto-generated method stub
		System.out.println("----이벤트 전체보기----");
		for (int i = 0; i < eventList.length; i++) {
			if (eventList[i] != null) {
				System.out.println();
				eventList[i].prt1();
			}
		}
	}

	private void add_event() {
		// TODO Auto-generated method stub
		System.out.println("이벤트의 제목을 입력해주세요.");
		String event_name = in.nextLine();

		for (Event e_list : eventList) {
			if (e_list != null && e_list.eName.equals(event_name)) {
				System.out.println("이미 존재하는 이벤트 제목입니다. 다시 입력해주세요.");
				return;
			}
		}
		Event e_info = new Event();
		e_info.eName = event_name;
		System.out.println();
		System.out.println("이벤트의 내용을 입력해주세요.");
		e_info.eText = in.nextLine();
		for (int i = 0; i < eventList.length; i++) {
			if (eventList[i] == null) {
				eventList[i] = e_info;
				System.out.println("등록이 완료되었습니다.");
				break;
			}
		}
	}
}
