package _03반복문;

public class _06_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 값을 모두 더한 총합을 구하시오.
		int sum=0;
		int[] arr={45,23,25,64,3,24,48};
		for(int i=0;i<7;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
