package _08_Array2;

public class _06_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		
//		Q6)2차원배열의 모든 값을 출력하시오.
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a[i].length - 1; j >= 0; j--) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
//		내림차순이라 i와 j가 거꾸로 2차원배열 a의 뒤에부터 거꾸로 
	}

}
