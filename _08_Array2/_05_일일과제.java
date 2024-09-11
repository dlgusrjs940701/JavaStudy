package _08_Array2;

public class _05_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		
//		Q5)전체 배열의 값 중 홀수를 0으로 마스킹하고, 마스킹 된 결과 2차원 배열을 출력하시오.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 1) {
					System.out.print("0" + "\t");
				} else {
					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();
		}
//		2차원배열의 값을 2로 나눠 홀수면 "0"이 출력
	}

}
