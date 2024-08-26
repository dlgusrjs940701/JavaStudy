package _06_2중for;

public class _01_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 문제
		for (int i = 1; i < 5; i++) {
//			System.out.println(i);
			for (int k = 1; k < 5; k++) {
				System.out.println(i + "*" + k + "=" + (i * k));
			}
			System.out.println();
		}
	}

}
