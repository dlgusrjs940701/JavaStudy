package _08_Array_2차;

public class _03_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;

//		문제3

		for (int i = 0; i < row; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < col; j++) {
					a[i][j] = num++;
//					위코드는 대입연산자가 일어난 후 단일 연산자인 ++이 실행된다.
//					만약 a[행][열]=++num;
//					이것은 단일 연산자가 먼저 일어난 후 대입연산자가 실행된다.
				}
			} else {
				for (int j = col - 1; j >= 0; j--) {
					a[i][j] = num++;
				}
			}
		}
//		짝수행일때는 증가
//		홀수행일때는 감소

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}