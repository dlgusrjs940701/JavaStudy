package _03반복문;

public class _12_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자는 터널의 번호이다. 
		// 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int cnt=0;
		int bT=arr[0];
		int maxLength=0;
		int maxIndex=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==bT) {
				cnt++;
			}else {
				bT=arr[i];
				cnt=1;
			}// System.out.println(i+"/"+cnt);
			if(maxLength<cnt) {
				maxLength=cnt;
				maxIndex=bT;
			}
		}System.out.println(maxLength +"/"+ maxIndex);
	}

}
