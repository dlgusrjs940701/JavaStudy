package _04조별미션;

public class _00_선택받은너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 짝수만 출력하세요.
		
		int[] letter={8,12,4,13,2,14,4,5};
		for(int i=0;i<letter.length;i++) {
			if(letter[i]%2==0) {
				System.out.println(letter[i]);
			}
		}
	}
}
