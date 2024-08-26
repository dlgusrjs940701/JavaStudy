package _06_2중for;

public class _05_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 40보다 큰 수는 모두 몇개인가?
		int[] a = { 34, 55, 23, 56, 34, 45, 34 };
		int cnt = 0;
		int k = 40;

		for (int i = 0; i < a.length; i++) {
//			System.out.println(i);
			if (k < a[i]) {
				cnt++;
			}
		}
		System.out.println("40보다 큰 수의 갯수는 : " + cnt+"개입니다.");
	}

}
