package _10_Class_level1;

import java.util.Scanner;

public class T_center {
//		기차 여러대를 등록하고 보고 수정하는 역할
//		기차 여러대를 관리하기 위해서 배열이라는 자료형을 선택
	T_one[] tlist = new T_one[5];

//	생성자는 없는게 아니라 기본이 생략이 된 상태
	public T_center() { // 생략이 된 상태
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 전체보기");
			System.out.println("4. 종료");
			System.out.println("메뉴선택 > ");
			int selNum = in.nextInt();
			in.nextLine();

			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				mod();
			} else if (selNum == 3) {
				listAll();
			} else if (selNum == 4) {
				break;
			}
		}
	}

	private void listAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < tlist.length; i++) {
			if(tlist[i]!=null) {
				tlist[i].prt();	
			}
		}
	}

	private void mod() {
		// TODO Auto-generated method stub
		System.out.println("수정할 기차 번호 입력");
		Scanner in = new Scanner(System.in);
		String modNum = in.nextLine();

//		조건을 걸어본다. 기차번호는 유니크 하다.
		for (int i = 0; i < tlist.length; i++) {
			if (tlist[i].tNum.equals(modNum)) {
//				기차번호가 유니크 하다는 것은 뒤에 있는 기차번호랑 중복이 될 수 없다.
//				그래서 바로 수정이 가능하다.
				System.out.println("수정 시간입력");
				tlist[i].tTime = in.nextLine();
			}
		}
	}

	private void add() {
		// 기차시간을 추가
//		T_one 객체를 생성하고 기차번호와 시간을 입력
		Scanner in = new Scanner(System.in);
		T_one tempT = new T_one();
		System.out.println("기차 번호를 입력하세요.");
		tempT.tNum = in.nextLine();
		System.out.println("기차 시간을 1203 형식으로 입력");
		tempT.tTime = in.nextLine();

//		배열의 빈칸에 저장, 빈 칸은 배여르이 값이 null
		for (int i = 0; i < tlist.length; i++) {
			if (tlist[i] == null) {
				tlist[i] = tempT;
				break;
			}
		}
	}
}
