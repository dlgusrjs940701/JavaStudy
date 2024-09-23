package _08_Array_2차;

public class _04_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;

//		문제4

		for(int i=0; i<8;i++) {
			System.out.println(i +"번째 채우기를 합니다.");
			for(int j=0;j<=i;j++) {
				System.out.println("j<행>"+j);
			}
		}
//		for (int k = 0; k < row + col; k++) {
//			for (int i = 0; i < row; i++) {
//				for (int j = 0; j < col; j++) {
//					if (i + j == k) {
//						a[i][j] = num;
//						num++;
//					}
//				}
//			}
//		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
