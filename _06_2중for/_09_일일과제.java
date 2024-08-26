package _06_2중for;

public class _09_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요.

		// a중에 가장 긴 a? i는 a문자열의 index

		// 변수 두 개가 필요한데 maxCnt : a 길이 중 가장 긴 길이
		// cnt : 현재의 a 길이

		String ttt = "aabbbcccaaaaddbbbaaaaa";
		int maxCnt = 0;
		int cnt = 0;
		char maxChar = ' ';
		char nowChar = ' ';

		for (int i = 0; i < ttt.length(); i++) {
			nowChar = ttt.charAt(i);
			cnt = 0;
			for (int j = i; j < ttt.length(); j++) { // 모르니까 끝까지 찍어보겠다.
				if (ttt.charAt(j) != nowChar) {
					break;
				} else {
					cnt++;
				}
			}
			if (maxCnt < cnt) {
				maxCnt = cnt;
				maxChar = nowChar;
			}
			i = i + cnt - 1; //
			System.out.println(maxCnt);
			System.out.println(maxChar);
		}

//
//		int maxCount = 1;
//
//		for (int i = 0; i < ttt.length(); i++) {
//			int cnt = 1;
//			for (int k = i + 1; k < ttt.length(); k++) {
//				if (ttt.charAt(i) == ttt.charAt(k)) {
//					cnt++;
//				} else {
//					break;
//				}
//			}
//			if (cnt > maxCount) {
//				maxCount = cnt;
//				System.out.println("가장 긴 터널의 알파벳 이름 : " + ttt.charAt(i));
//				System.out.println("터널의 길이 : " + maxCount);
//			}
//		}
	}

}
