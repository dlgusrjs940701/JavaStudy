package _10_Class_미션2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customer_a ca = new Customer_a();
		Event_a ea = new Event_a();
		// TODO Auto-generated method stub
		System.out.println("-----고객 및 이벤트 관리 프로그램-----");
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("------관리 프로그램------");
			System.out.println("1. 고객관리");
			System.out.println("2. 이벤트관리");
			System.out.println("3. 종료");
			System.out.println(" 선택 >>>");
			System.out.println();
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + " 번을 선택하셨습니다");
			System.out.println();
			if (selNum == 1) {
				ca.Customer_a();
			} else if (selNum == 2) {
				ea.Event_a();
			} else {
				break;
			}
		}
	}
}
