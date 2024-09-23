package _10_Class_미션;

import java.util.Scanner;

public class Customer_p {
	
	Customer_info[] cList=new Customer_info[10];
	Scanner in=new Scanner(System.in);
	
	Customer_p(){
		while(true) {
			System.out.println();
			System.out.println("------고객관리 프로그램------");
			System.out.println("1. 가입");
			System.out.println("2. 정보보기");
			System.out.println("3. 수정하기");
			System.out.println("4. 삭제하기");
			System.out.println("5. 종료");
			System.out.println(" 선택 >>>");
			System.out.println();
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + " 번을 선택하셨습니다");
			System.out.println();
			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				allList();
			} else if (selNum == 3) {
				mod();
			} else if (selNum == 4) {
				delete();
			} else {
				break;
			}
		}
	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.println("고객의 정보를 삭제하겠습니다. 고객의 아이디를 입력해주세요.");
		String cmDelete=in.nextLine();
		
		for (int i = 0; i < cList.length; i++) {
	        if (cList[i] != null && cList[i].cId.equals(cmDelete)) {
	            cList[i] = null;
	            System.out.println();
	            System.out.println("고객의 정보가 삭제되었습니다.");
	            return;
	        }
	    }
	    System.out.println("해당 고객 ID가 존재하지 않습니다.");
	}

	private void mod() {
		// TODO Auto-generated method stub
		System.out.println("고객의 정보를 수정하겠습니다. 고객의 기존 ID를 입력해주세요.");
//		Scanner in = new Scanner(System.in);
		String cIds = in.nextLine();

		for (int i = 0; i < cList.length; i++) {
			if (cList[i].cId.equals(cIds)) { 
				System.out.println();
				System.out.println("변경될 고객의 아이디를 입력해주세요");
				cList[i].cId = in.nextLine();
				System.out.println();
				System.out.println("변경될 고객의 이름을 입력해주세요");
				cList[i].cName=in.nextLine();
				break;
			}
		}
	}

	private void allList() {
		// TODO Auto-generated method stub
		System.out.println("고객들의 정보를 조회하겠습니다.");
		for (int i = 0; i < cList.length; i++) {
			if (cList[i] != null) {
				System.out.println();
				cList[i].prt();
			}
		}
	}

	private void add() {
		// TODO Auto-generated method stub
		System.out.println("고객의 ID를 입력해주세요.");
	    String newId = in.nextLine();

	    // 중복 확인
	    for (Customer_info customer : cList) {
	        if (customer != null && customer.cId.equals(newId)) {
	            System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 입력해주세요.");
	            return;
	        }
	    }
		Customer_info cmInfo = new Customer_info();
		cmInfo.cId = newId;
		System.out.println();
		System.out.println("고객의 이름을 입력해주세요.");
		cmInfo.cName = in.nextLine();
		for (int i = 0; i < cList.length; i++) {
			if (cList[i] == null) {
				cList[i] = cmInfo;
				System.out.println("가입이 완료되었습니다.");
				break;
			}
		}
	}
}
