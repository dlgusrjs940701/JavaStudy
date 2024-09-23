package _08_Array_2차;

public class _테트리스문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tempArr = { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 0, 0 } };

//		문제2 왼쪽으로 회전

		int row = tempArr.length;
		int col = tempArr[0].length;

		for (int i = col - 1; i >= 0; i--) {
			for (int j = 0; j < row; j++) {
				System.out.print(tempArr[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
