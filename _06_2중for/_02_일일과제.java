package _06_2중for;

public class _02_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < 6; i++) {
//			for (int k = 4; k >= i; k--) {
			for (int k = 0; k <= 4 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
