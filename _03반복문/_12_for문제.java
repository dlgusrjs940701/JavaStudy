package _03반복문;

public class _12_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자는 터널의 번호이다. 
		// 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		int maxLength=0;
		int length=0;
		int maxNum=0;
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
		for(int i=0;i<24;i++) {
			int num=arr[i];
			if(arr[i]==num) {
				maxLength++;
				length++;
				maxNum=arr[i];
			}else {
				if(length>maxLength) {
					maxLength=0;
					maxNum=0;
				}
			}
		}
		System.out.println(maxLength);
	}

}
