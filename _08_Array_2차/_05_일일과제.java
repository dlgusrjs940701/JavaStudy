package _08_Array_2차;

public class _05_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;
		int rowMin = 0;
		int rowMax = 3;
		int colMin = 0;
		int colMax = 4;

		for (int j = 0; j < 2; j++) {
//			맨 위는 rowMin=0, rowMax=4
//			두번째는 rowMin=1, rowMax=3
			for (int i = colMin; i <= colMax; i++) {
				a[rowMin][i] = num++;
			}
			rowMin++;

//			위 반복문이 완료되었다면 0번행은 채울필요없다.
//			행의 최소값을 증가시켜버린다.
			for (int i = rowMin; i <= rowMax; i++) {
				a[i][colMax] = num++;
			}
			colMax--;

			for (int i = colMax; i >= colMin; i--) {
				a[rowMax][i] = num++;
			}
			rowMax--;

			for (int i = rowMax; i >= rowMin; i--) {
				a[i][colMin] = num++;
			}
			colMin++;;
		}

//		문제5
//		달팽이를 만드세요......................................

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
