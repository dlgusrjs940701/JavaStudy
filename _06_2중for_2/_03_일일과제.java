package _06_2중for_2;

public class _03_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 팩토리얼의 합 구하기
		// 1부터 10까지 숫자의 각 패토리얼의 합을 구하시오
		// 예를들어 4의 팩토리얼은 1*2*3*4
		// 5의 팩토리얼은 1*2*3*4*5

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int aa = 0;

		for (int i = 1; i <= 10; i++) {
			int sum = 1;
			for (int j = 1; j <= i; j++) {
				sum *= j;
			}
			aa += sum;
		}
		System.out.println("각 패토리얼의 합은 : " + aa);
		
		int sum=0;
		int fmul=1;
		for(int i=1; i<= 10; i++) {
			fmul=1;
			for(int j=i; j>=1; j--) {
				fmul *= j;
			}
			System.out.println(i+"일 때 팩토리얼 : "+fmul);
			sum += fmul;
			
		}
		System.out.println("팩토리얼 총합 : "+sum);
	}

}
