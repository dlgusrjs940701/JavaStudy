package _03반복문;

public class _11_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0은 터널이다. 가장 긴 터널의 길이를 구하시오.
//		int maxlength=0;
//		int length=0;
		int[] arr={1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		
//		for(int i=0;i<22;i++) {
//			if(arr[i]==0) {
//				length++;
//			}else {
//				if(length>maxlength) {
//					maxlength=length;
//					length=0;
//					
//				}
//			}
//		}System.out.println(maxlength);
		
		
		// 1. for문으로 배열 순회 초기값 = 0 ~ ; < 배열의 길이 ; i++
				// i는 배열의 index
		// 2. 터널인지 아닌지 참 거짓 판별하는 변수
		// 3. A에서는 터널 카운팅
		//    B에서는 최대길이 판별
		int maxLength=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;     // i가 5일 경우 count =3
			}else {
				count=0;
			}
			if(count>maxLength) {
				maxLength=count;
			}
		}System.out.println(maxLength);
	}		
}

		
		
	