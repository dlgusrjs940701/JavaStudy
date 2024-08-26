package _03반복문;

public class _14_for문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요.
		// 1. 문자열의 문자를 가져온다
		//    문자를 첫번째부터 하나씩 가져온다.
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int cnt=0;
		String resultZip="";
		char bT=ttt.charAt(0);
		int maxCnt=0;
		int maxNumber=0;
		for(int i=0;i<ttt.length();i++) {
			if(bT==ttt.charAt(i)) {
				cnt++;
			}else {
				resultZip=resultZip+(char)bT+cnt;
				bT=ttt.charAt(i);
				cnt=1;
			}
			resultZip=resultZip+(char)bT+cnt;
//			if(maxCnt<cnt) {
//				maxCnt=cnt;
//				maxNumber=bT;
//			}
		}
		System.out.println(resultZip);
	}

}
