package _05반복문2;

import java.util.Random;

public class _05_조별미션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또번호를 자동으로 생성하는 게임을 작성하시오.
		// 중복허용 가능, 로또번호 6개를 배열에 저장하고 출력하시오.
		
		Random r=new Random();
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			int num=r.nextInt(45)+1;
			lotto[i]=num;
//			System.out.println(lotto[i]);
		}
		for(int i=0;i<lotto.length;i++) {
			if(i==lotto.length-1) {
				System.out.println("보너스 숫자: "+lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
		}
	}

}
