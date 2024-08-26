package _06_2중for;

public class _08_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 애니팡 게임의 일부분이다. 게임의 캐릭터는 숫자로 구분한다.
		// 가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		// 제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		
		int[] pang = { 1, 0, 0, 0, 2, 3, 4, 4, 6, 2, 2, 2, 2, 5 };
		int cnt=0;
		int nowNumber=0;
		
		for(int i=0;i<pang.length;i++) {
			nowNumber=pang[i];
			cnt=0;
			for(int j=i;j<pang.length;j++) {
				if(nowNumber==pang[j]) {
					cnt++;
				}else {
					break;
				}
			}
			if(cnt>=3) {
				System.out.println("제거 대상 캐릭터 번호: "+nowNumber);
				System.out.println("개수 : "+cnt);
				System.out.println("인덱스 번호 : "+i);
			}
		}
//
//		for (int i = 0; i < pang.length; i++) {
//			int cnt = 1;
//			for (int e = i + 1; e < pang.length; e++) {
//				if (pang[e] == pang[i]) {
////					System.out.println(pang[e]);
//					cnt++;
//					if (cnt >= 3) {
//						System.out.println("제거 대상 캐릭터 번호: " + pang[i]);
//						System.out.println("개수: " + cnt);
//						System.out.println("시작 위치 인덱스: " + i);
//						System.out.println();
//					}
//				} else {
//					break;
//				}
//			}
//		}
	}
}
