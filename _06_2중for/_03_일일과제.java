package _06_2중for;

public class _03_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 000*
		// 00***
		// 0*****
		// *******
		
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
		
		for(int i=0; i<4; i++) {
			for(int k=0;k<4+i;k++) {
				if(k>=4-i-1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
