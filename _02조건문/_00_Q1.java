package _02조건문;

public class _00_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1
		int point = 20;
		int x = 22;
		
		if(x >= 0 && x <= 12) {
			point += 10;
			if(x==0||x==1) {
				point += point*0.1;
			}
		}
		else if(x <=20) {
			point += 9;
		}
		else if(x <=30) {
			point += 8;
		}
		else if(x >=31) {
			point += 7;
		}
		System.out.println(point);
		
		// Q2
//		if(x >= 0 && x <= 12) {
//			System.out.println("10점");
//		}
//		if(x==0||x==1) {
//			System.out.println(point/10);
//		}
	
	}

}
