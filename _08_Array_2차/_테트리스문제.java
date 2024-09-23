package _08_Array_2차;

public class _테트리스문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tempArr = { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 0, 0 } };

//		문제1 오른쪽으로 회전
		int row = tempArr.length;
		int col = tempArr[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = col - 1; j >= 0; j--) {
				System.out.print(tempArr[j][i] + "\t");
			}
			System.out.println();
		}
	}
}
