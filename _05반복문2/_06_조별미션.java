package _05반복문2;

import java.util.Random;

public class _06_조별미션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑느다.
		// 가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		// 오늘의 추천 로또 번호 하나를 출력하시오. 만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
		
		Random r=new Random();
		int[] lotto=new int[10000];
		
		for(int i=0;i<lotto.length;i++) {
			int num=r.nextInt(45)+1;
			lotto[i]=num;
		}
		
		//45번까지 배열을 만들고 숫자 카운팅
		int [] cntNum=new int[46];
		for(int i=0;i<lotto.length;i++) {
			cntNum[lotto[i]]++;
//			System.out.println(cntNum[i]);
		}
		
		// 많이 뽑힌 변수
		int maxCount=0;
		// 가장 큰 변수
		int maxCount2=0;
		for(int i=1;i<cntNum.length;i++) {
			if(cntNum[i]>maxCount||(i>maxCount2&&cntNum[i]==maxCount)) {
				maxCount=cntNum[i];
				maxCount2=i;
			}
		}
		System.out.println("행운의 숫자: "+maxCount2);
	}

}
