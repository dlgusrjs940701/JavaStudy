package _08_Array_2차;

public class _01_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		선언문(변수와 자료형) 변수명 : a, 자료형은 2차원배열
//		변수 : 값을 저장하는 기억공간
//		2차원 배열은 행과 열로 이루어진 기억공간
//		int[4][5] + 행이 4개, 열이 5개
		 
		int[][] a = new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;
		for(int 행=0;행<4;행++) {
			for(int 열=0;열<5;열++) {
				System.out.print(a[행][열]+"\t");
			}
			System.out.println();
		}

//		문제1

		for (int i = col - 1; i >= 0; i--) {
			for (int j = 0; j < row; j++) {
				a[j][i] = num;
				num++;
			}

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
