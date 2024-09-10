package _08_Array2;

public class _08_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = { { 1, 1, 0, 2 }, { 3, 2, 1, 2 }, { 0, 0, 3, 2 }, { 4, 4, 4, 4 }, { 2, 4, 3, 1 }, { 2, 4, 1, 3 } };
		
//		Q8)같은 번호가 가로나 세로로 각각 3개 이상이면 제거가 가능하다.
		
		for (int i = 0; i < aa.length; i++) {
			int count = 0;
			int value = 0;
			int temp = 0;
			for (int j = 0; j < aa[i].length; j++) {
				if (aa[i][j] == value) {
					count++;
				} else {
					value = aa[i][j];
					count = 1;
					temp = j;
				}
				if (count >= 3) {
					for (int k = temp; k <= j; k++) {
						System.out.println("가로좌표 (" + i + ", " + k + ")");
					}
				}
			}
		}
		System.out.println();
		for (int i = 0; i < aa[i].length; i++) {
			int count = 0;
			int value = 0;
			int temp = 0;
			for (int j = 0; j < aa.length; j++) {
				if (aa[j][i] == value) {
					count++;
				} else {
					value = aa[j][i];
					count = 1;
					temp = j;
				}
				if (count >= 3) {
					for (int k = temp; k <= j; k++) {
						System.out.println("세로좌표 (" + k + ", " + j + ")");
					}
				}
			}
		}
	}

}
