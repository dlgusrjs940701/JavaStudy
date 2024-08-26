package _03반복문;

public class _07_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 짝수는 모두 몇개인가요?
		int count=0;
		int[] arr= {45,23,25,64,3,24,48};
		for(int i=0;i<7;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
