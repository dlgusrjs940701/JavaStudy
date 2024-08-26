package _04조별미션;

public class _01_큰놈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 가장 큰 수가 있는 인덱스를 출력하시오.
		
		int[] letter={8,12,4,13,2,14,4,5};
		int max=0;
		int maxIndex=0;
		for(int i=0;i<letter.length;i++) {
			if(max<letter[i]) {
				max=letter[i];
				maxIndex=i;
			}
		}
		System.out.println(maxIndex);
	}
}
