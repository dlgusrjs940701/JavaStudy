package _06_2중for;

public class _11_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아직 풀어야함 
		
//		000*
//		00***
//		0*****
//		*******
//		0*****
//		00***
//		000*
		
		// j의 값이 if로 출력문자 변경
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4 + i; j++) {
						if (j >= 4 - i - 1) {
							System.out.print("*");
						} else {
							System.out.print("0");
						}
					}
					System.out.println();
				}
				for (int i = 2; i >=0; i--) {
					for (int j = 0; j < 4 + i; j++) {
						if (j >= 4 - i - 1) {
							System.out.print("*");
						} else {
							System.out.print("0");
						}
					}
					System.out.println();
				}
		
//		for (int i = 0; i < 4; i++) {
//			// 0을 출력
//			for (int j = 0; j < 3 - i; j++) {
//				System.out.print("0");
//			}
//			// *를 출력
//			for (int j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("0");
//			}
//			for (int j = 0; j < 7 - i - (i - 0); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
