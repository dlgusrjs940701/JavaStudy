package _00평가;

import java.util.Scanner;

public class _01평가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		위 배열에서 인덱스를 사람의 번호로 가정한다.
//		jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
//		작업장을 사용할 수 있는 시간은 최대  4시간이다.
//		작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
//		다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
//		0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
//		실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
		
		int[] jobTime ={40,32,4,16,5,8};
		
		int useNum = 0;  
		int totalCount = jobTime.length; 
		int useTime=4;  
		int cnt=0; 
		for(;;) {
			if(jobTime[useNum] > 0) {   
				System.out.print(useNum+" 사용중입니다. ");
				jobTime[useNum] -= useTime; 
				System.out.println(jobTime[useNum]+" 시간 남았습니다.");
				if(jobTime[useNum] <= 0 ){  
//					System.out.println(useNum +" 사용 완료하였습니다.");
					cnt++;
				}
				if(cnt == totalCount ) {   
					break;
				}			
			}
			useNum ++;
			useNum = useNum%totalCount;
			System.out.println(useNum +" 차례입니다.");
		}
	}

}
