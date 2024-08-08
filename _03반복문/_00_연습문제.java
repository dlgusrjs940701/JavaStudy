package _03반복문;

public class _00_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연습문제
		int[] a = {30,40,50,55,65};
		
		//65 55 50 40 30 출력
		for(int i = 4; i>=0; i--) {
			System.out.println(a[i]);
		}
		
		//40 50 55 65 30 출력
		for(int i = 0; i<=4; i++) {
			System.out.println(a[(i+1)%5]);
		}
		
		//50 이상의 값만 출력
		//배열순회를 반복하면서 갑의 조건 판단 후 출력
		for(int i = 0; i<5; i++) {
			if(a[i] >= 50);
			System.out.println(a[i]);
		}
		
		//50점 이상 점수를 모두 합하시오.
		int sum = 0;
		for(int i = 0; i<5; i++) {
			if(a[i] >= 50)
			sum+=a[i];
		}
		System.out.println(sum);
		
		//50점 이상의 값의 평균을 구하시오.
		
		int count = 0;
		for(int i = 0; i<5; i++) {
			if(a[i] >= 50) {
				sum+=a[i];
				count++;
			}
				
				
		}
		System.out.println((double)sum/count);
		
		
		//최저점수를 뺀 나머지 값의 평균을 구하시오.
		// 최저값 찾기
		int minvalue = 10000;
		for(int i = 0; i<5; i++) {
			if(minvalue>a[i]) {
				minvalue=a[i];
			}
		}
		// 누적 합 구하기
		for(int i = 0; i<5; i++) {
			if(minvalue!=a[i]) {
				minvalue+=a[i];
				count++;
			}
		}
		// 평균 구하기
		System.out.println(((double)sum-minvalue)/count);
	}

}
