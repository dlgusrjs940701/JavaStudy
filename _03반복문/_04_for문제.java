package _03반복문;

public class _04_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에서 배열의 값이 짝수인 것만 출력하시오.
		int[] arr= {45,23,25,64,3,24,48};
		for(int i=0;i<7;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
