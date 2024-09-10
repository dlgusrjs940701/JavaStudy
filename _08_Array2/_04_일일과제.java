package _08_Array2;

public class _04_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		
//		Q4)전체배열의 값 중 짝수는 모두 몇개인가?
		
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
