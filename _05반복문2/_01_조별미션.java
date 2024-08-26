package _05반복문2;

import java.util.Scanner;

public class _01_조별미션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int k1=in.nextInt();
		in.nextLine();
		int sum=k+k1;
		
		System.out.println("합은 : "+sum);
	}

}
