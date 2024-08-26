package _06_2중for;

public class _07_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 거스름돈 구하기 10000원짜리 0개, 1000원짜리 0개, 100원짜리 0개, 10원짜리 0개
		// 조건 : /나 %연산자는 각각 최대 두번씩 사용
		// 단, 거스름돈은 만천원이 최대값이다.

		int money = 4570;
		int pay = 10000;
		int changeMoney = pay - money;

		int[] money1 = { 10000, 1000, 100, 10 };
		int[] count = new int[money1.length];
		
		for (int i = 0; i < money1.length; i++) {
			for (int k = 0; k <= changeMoney/money1[i]; k++) {
				if(k==changeMoney/money1[i]) {
					count[i]=k;
					changeMoney-=k*money1[i];
				}
			}
		}
		System.out.println("천원짜리 : " +count[1]);
		System.out.println("백원짜리 : " +count[2]);
		System.out.println("십원짜리 : " +count[3]);
	}

}
