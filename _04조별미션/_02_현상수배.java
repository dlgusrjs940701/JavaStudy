package _04조별미션;

public class _02_현상수배 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 범인을 찾으시오.
		// 범인은 짝수이면서 가장 큰 값이다.
		// 범인은 14입니다.
		
		int[] letter={8,12,4,13,25,14,4,5};
		int a=0;
		
		for(int i=0;i<letter.length;i++) {
			if(letter[i]%2==0) {
				if(a<letter[i]) {
					a=letter[i];
				}
			}	
		}
		System.out.println(a);
	}
	

}
