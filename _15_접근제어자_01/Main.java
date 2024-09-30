package _15_접근제어자_01;

import _15_접근제어자_02.MemberOne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberOne m=new MemberOne();
//		m.name="hong"; // Error : name변수 접근제어자 default
		m.prt();  // 가능
		m.setName("1234");
		m.setName("44");
	}

}
