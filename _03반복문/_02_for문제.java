package _03반복문;

public class _02_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
