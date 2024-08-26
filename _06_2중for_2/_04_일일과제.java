package _06_2중for_2;

public class _04_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 조건에 따라 오름차순으로 정렬하시오.
		// 1.가장 큰 값을 찾아서 맨 뒤 값과 교환한다. 결과 {56,45,83,58,75,93}
		// 2.두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다. 결과 {56,45,75,58,83,93}
		// 3.세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다. 결과 {56,45,58,75,83,93}
		// 오름차순으로 정렬이 될때까지 반복한다.

		int[] b = { 93, 45, 83, 58, 75, 56 };

//		for (int i = 0; i < b.length - 1; i++) {
////			System.out.println(i);
//			for (int j = 0; j < b.length - 1 - i; j++) {
////				System.out.println(j);
//				if (b[j] > b[j + 1]) {
//					int maxNum = b[j];
//					b[j] = b[j + 1];
//					b[j + 1] = maxNum;
//				}
//			}
////			System.out.println(b[i]);
////			System.out.println(b[b.length-1]);
//		}
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(+b[i] + " ");
//		}

		int tempMaxIndex = 0;

		for (int i = 0; i < b.length; i++) {
			System.out.println(i + "번째 큰값 찾는 중 -------------");
			tempMaxIndex = 0;
			for (int j = 0; j < b.length - i; j++) {
				System.out.println(j + "번째 부터 서치");
				if (b[tempMaxIndex] < b[j]) {
					tempMaxIndex = j;
				}
			}
			// 가장 큰 값과 뒤에 값과 swap
			int temp = b[b.length - 1 - i];
			b[b.length - 1 - i] = b[tempMaxIndex];
			b[tempMaxIndex] = temp;

			// i번째 큰 값 찾아서 변경된 배열 확인 반복문
			for (int k = 0; k < b.length; k++) {
				System.out.print(b[k] + " ");
			}
			System.out.println();

		}
	}

}
