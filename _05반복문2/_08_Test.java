package _05반복문2;

import java.util.Scanner;

public class _08_Test {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		// 키보드로 부터 입력받기 위한 객체 만들기.
		Scanner in = new Scanner(System.in); // ctrl shift o
		// 0번째 번호부터 로또 번호 입력받기
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번 입력하세요");
			int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
			if(k > 0 && k <= 45) {
			in.nextLine();  // 버퍼 지우기
			lotto[i] = k;
			}
			else {
				i = i - 1;
				System.out.println("범위 오류");
			}
		}
		// 로또 번호를 출력하는 반복문
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length - 1) { // 마지막 번호
				System.out.println("보너스 : " + lotto[i]);
			} else {
				System.out.println(lotto[i]);
			}
		}
	}

}

