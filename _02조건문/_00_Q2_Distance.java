package _02조건문;

public class _00_Q2_Distance {

	public static void main(String[] args) {
		/**
		 * 
int a = 10;
int b = 20;
int my = 15;
문제 a와 b는 도로의 길이이며 위치이다.
my는 나의 위치이다
내가 도로위에 있으면 도로위.. 도로위가 아니라면 도로가아님이라고 출력하시오
up1
만약 내가 도로위라면
a 지점으로 부터 5(my위치에  따라 달라짐)만큼 떨어져 있습니다 라고 출력하시오

up2
up1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다
예를들어 my 18이면 b에 더 가까우니 b에서 부터 2거리 떨어져 있습니다.
같은 거리일 경우는 a가 우선한다.

		 * 
		 * 
		 */
		int a = 10;
		int b = 20;
		int my = 18;
		
		//up1
		 if( a <= my && my <= b) {
			 System.out.println("도로 위");
		 }else {
			 System.out.println("도로가 아님");
		 }
		//up2
		 if( a <= my && my <= b) {
			 System.out.println("도로 위");
			 int distanceCenter = a+(b-a)/2;
			 System.out.println(distanceCenter);
			 if(my <= distanceCenter) {
				 System.out.println("a로 부터 "+(my-a));
			 }else {
				 System.out.println("b로 부터 "+(b-my));
			 }
		 }else {
			 System.out.println("도로가 아님");
		 }

	}

}










