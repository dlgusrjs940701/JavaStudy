package _10_Class_미션2샘소스;

import java.util.Scanner;

public class MainMenu {
	// 의존관계 설정 시작
	EventAdmin eventAdm = null;
	MemberAdmin memberAdm = null;

	MainMenu() {
		if (eventAdm == null) {
			eventAdm = new EventAdmin();
		}
		if (memberAdm == null) {
			memberAdm = new MemberAdmin();
		}
		memberAdm.eventA = eventAdm;
		// 초기화 작업할 때 많이 사용
		// 초기화 작업은 멤버변수의 값을 셋팅하는 느낌
		// 예) 데이터베이스에서 값을 가져와서 초기값 결정
		// 메뉴는 초기화 작업이라고 보기 어렵다
		// 별도로 메서드 처리 하겠다.
		menu();
	}

	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.고객관리");
			System.out.println("2.이벤트관리");
			System.out.println("3.프로그램종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				// memberAdm = new MemberAdmin();
				memberAdm.menu();
			} else if (num == 2) {
				// eventAdm = new EventAdmin();
				eventAdm.menu();
			} else if (num == 3) {
				break; // while문 종료
			}
		}

	}
}
