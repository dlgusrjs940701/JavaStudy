package _02조건문;

public class _00_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "이현건";
		int b = 13;
		int c = 31;
		int d = 97;
		String score = "";
		if(c < 18) {
			System.out.println("수강신청이 불가능하다");
		}else {
		
			if(d >= 90) {
				score = "A";
			}else if(d >= 80) {
				score = "B";
			}else if(d >= 70) {
				score = "C";
			}else if(d >= 60) {
				a += "*";
				score = "D";
			}else if(d < 60) {
				score = "F";
			}
		
		System.out.println("이름: "+a +" 학번 : "+b + " 나이 : "+c + " 성적 : "+score);
	}

}
}
