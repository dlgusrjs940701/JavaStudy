package _06_2중for_2;

import java.util.Scanner;

public class _06_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		<이번 저희회사에서는 회원관리 프로젝트를 담당하게 되었습니다.
//		회원관리 프로젝트 중 회원의 아이디 유효성 체크를 미션으로 드립니다>
//		
//		키보드로 아이디를 입력받는다.
//		입력 받은아이디에 특수 문자가 포함 되었는지 확인한다. (유효성)
//		특수 문자는 @한개로 정의한다.
//		특수문자가 몇 개 포함되었는지 출력합니다.

		Scanner in = new Scanner(System.in);

		System.out.print("아이디를 입력하세요. ");
		String id = in.nextLine();
		int cnt = 0;

		for (int i = 0; i < id.length(); i++) {
			if (id.charAt(i) == '@') {
				cnt++;
			}
		}
		if(cnt>=1) {
			System.out.println("아이디를 다시 입력하세요.");
			System.out.println("특수문자 포함 갯수 : " + cnt);
		}else {
			System.out.println("이 아이디는 사용가능합니다.");
		}

	}

}
