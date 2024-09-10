package _08_Array2;

public class _01_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

////	Q1)2차원배열 a의 2번째 행의 모든 값을 출력하시오.
		for (int i = 0; i < a[1].length; i++) {
			System.out.println(a[1][i]);
		}
	}
}
