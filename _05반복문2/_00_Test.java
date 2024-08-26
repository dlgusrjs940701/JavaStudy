package _05반복문2;

import java.util.Random;  // Random이라는 클래스를 인식시켜주는 작업 (컨트롤 + 쉬프트 + O)

public class _00_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6개의 랜덤한 로또번호
		Random r=new Random();
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
//			System.out.println((i+1)+"번째");
			int k=r.nextInt(45)+1; // r변수를 참조하여 nextInt라는 기능을 호출, 리턴 받은 수(0~44)에 +1을 한다.
			lotto[i]=k;
			
		}
		for(int i=0;i<lotto.length;i++) {
			if(i==lotto.length-1) {   // 마지막 번호
				System.out.println("보너스 : "+lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
//			System.out.println(lotto[i]);
		}
	}

}

