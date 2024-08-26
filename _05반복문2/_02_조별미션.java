package _05반복문2;

import java.util.Random;

public class _02_조별미션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 행운의 숫자인지를 판별해보자
		// 1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		// 이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자.
		
		Random r=new Random();
		
		
			int k=r.nextInt(100)+1;
//			System.out.println(k);
			if(k%7==0) {
				System.out.println(k+":"+"행운의 숫자입니다.");
			}else {
				System.out.println(k+":"+"조심해야 하는 숫자입니다.");
			}	
	}
}
