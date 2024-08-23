package testpm;

import java.sql.SQLOutput;

import org.w3c.dom.ls.LSOutput;

class test01 {

	public static void main(String[] args) {
		System.out.println("<메모장 프로그램>");
		
		String subject = "[나의 점심]";
		String fild = "[오늘은 자장면]";
		System.out.println("제목 : " + subject);
		System.out.println("본문 : " + fild);
		System.out.println("---------------");
		
		subject = "[점심메뉴]";
//		System.out.println("제목 : " + subject);
		
		int cnt =0;
		fild = "[짬뽕도 먹음]";
		cnt = 10;
		System.out.println("제목 : " + subject);
		System.out.println("본문 : " + fild);
		System.out.println("조회수 : " + cnt);
		System.out.println("---------------");
		
		// level up1
		System.out.println("<level up1>");

		fild = fild + " [탕수육도 먹음]";
//		fild = String.format("[짬뽕도 먹음, %s]", "탕수육도 먹음");

		System.out.println("제목 : " + subject);
		System.out.println("본문 : " + fild);
		System.out.println("조회수 : " + cnt);
		
		// level up2
		System.out.println("\n<level up2>");
		int point = 80;
		System.out.println("문제1)포인트 : " + point);
		int num1, num2;
		num1=10;
		num2=4;
		double c = num1/num2;
		System.out.println("문제2)num1 / num2 몫 : " + c);
		System.out.println("문제2)num1 / num2 몫 : " + (double) (num1/num2));
		String name = null;
		name = "홍길동";
		System.out.println("문제3)이름 : " + name + "님");
		int english = 90;
		int math = 87;
		int computer = 100;
		double sum = english + math + computer;
		double avr = sum /3;
		System.out.println("문제4)평균 : " + avr);
		
		int a = 10;
		System.out.println("\n<level up3>");
		System.out.print(a+"의 3배수 결과 : ");
		System.out.println((a%3)==0);
//		System.out.println((a%3)==0 ? "true": "false");
		
	}

}
