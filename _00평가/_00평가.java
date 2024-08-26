package _00평가;

public class _00평가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		네트워크 통신 문자열 분석 알고리즘의 기능을 구현하시오.
		String a ="aabbccddeeeaaaa";
//		a문자는 통신 문자이다. a 문자 중 가장 길이를 출력하시오.
//		위 예제에서는 결과값이 5가된다.

		int cnt=0;
		int bT=a.charAt(0);
		int maxCnt=0;
		int maxNumber=0;
		for(int i=0;i<a.length();i++) {
			if(bT==a.charAt(i)) {
				cnt++;
			}else {
				bT=a.charAt(i);
				cnt=1;
			}
			if(maxCnt<cnt) {
				maxCnt=cnt;
				maxNumber=bT;
			}
		}
		System.out.println(maxCnt +"/"+ (char)bT);
	}

}
