package _05반복문2;

import java.util.Random;

public class _03_조별미션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
		// 7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올때까지 계속 뽑는다.
		
		Random r=new Random();
		
		while(true) {
			int k=r.nextInt(100)+1;
			if(k%7==0) {
				System.out.println(k+" : "+ "행운의 숫자입니다.");
				break;
			}
		}
//		System.out.println(k);
	}
}
