package _03반복문;

public class _11_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		int maxlength=0;
		int length=0;
		int[] arr={1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		for(int i=0;i<22;i++) {
			if(arr[i]==0) {
				length++;
			}else {
				if(length>maxlength) {
					maxlength=length;
					length=0;
					
				}
			}
		}System.out.println(maxlength);
	}

}
