package _05반복문2;

import java.util.Scanner;

public class _00_조별미션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		
		Scanner in=new Scanner(System.in);
		int k = in.nextInt();
		in.nextLine();
		if(k%2==0) {
			System.out.println(k+"는 짝수입니다.");
		}else {
			System.out.println(k+"는 홀수입니다.");
			
		}
//		System.out.println(k);
		
		}

}
