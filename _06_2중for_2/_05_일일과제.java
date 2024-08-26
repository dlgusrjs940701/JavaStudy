package _06_2중for_2;

public class _05_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// carnum배열의 인덱스가 0인 값부터 주차장에 들어온다. // carnum배열은 자동차 번호를 의미합니다. 
//		   parking의 인덱스 번호가 주차번호이다. 
//		   자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
//		   만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
//		   (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)
//
//		   주차가 끝난 후 주차번호와 주차항 차량 번호를 출력하시오.
		
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		int nowCar=0;
		int carPositionIndex=0;
		int totalCarCnt=0;
		for(int i=0; i < carnum.length; i++) {
			//초기 주차 정보 분석
			nowCar = carnum[i];
			carPositionIndex = nowCar%10;
			System.out.println(nowCar+"차량 "+carPositionIndex +" 번이 주차자리입니다");
			
			// 주차장에 자리가 있다면
			if(totalCarCnt < parking.length) {
				//빈자리를 찾을 때 까지 반복
				for(;parking[carPositionIndex]!=0;) {
					System.out.println("빈자리인지 확인 중입니다.");
					carPositionIndex=(carPositionIndex+1)%(parking.length);
					System.out.println(carPositionIndex+"번호로 새로 배정");
				}
				
				// 22 반복문에서 빈자리를 찾았다면
				System.out.println(carPositionIndex+"번호에 주차 합니다");
				parking[carPositionIndex]=nowCar;		
				totalCarCnt++;				
			}
			
		}
	}

}
