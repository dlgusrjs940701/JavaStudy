package _06_2중for;

public class _06_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// b배열의 값보다 큰 값이 a배열의 값에 모두 몇개가 있는가?
		// 각각 카운팅 하시오.
		int[] a = { 34, 55, 23, 56, 34, 45, 34 };
		int[] b = { 36, 49 };

		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < a.length; i++) {
			if (b[0] < a[i]) {
				cnt1++;
			}
			if (b[1] < a[i]) {
				cnt2++;
			}
		}
		System.out.println("a 배열의 값에는 36 번호보다 큰 숫자가 : " + cnt1 + "개 있습니다.");
		System.out.println("a 배열의 값에는 49 번호보다 큰 숫자가 : " + cnt2 + "개 있습니다.");
	}
}
