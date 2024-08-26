package _03반복문;

public class _09_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		int maxValue=0;
		int maxIndex=0;
		int[] arr= {45,23,25,64,3,24,48};
		for(int i=0;i<7;i++) {
			if(maxValue<arr[i]) {
				maxValue=arr[i];
				maxIndex=i;
			}
		}
		System.out.println("최대값 : " +maxValue+"/"+ "최대값인덱스 : " +maxIndex);
	}

}
