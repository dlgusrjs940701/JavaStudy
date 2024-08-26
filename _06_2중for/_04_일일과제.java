package _06_2중for;

public class _04_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("0");
			}
			for (int j = 0; j < 7 - i - (i - 0); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

