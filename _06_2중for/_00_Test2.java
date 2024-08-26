package _06_2중for;

public class _00_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		String id = "abc*"; // 아이디
		String sign = "*^&"; // 특수문자
		// 아이디에 특수문자가 있는가?
		// 1. sign의 0번 문자부터 찾는다.
		// 2. id의 0번 문자가 특수문자인가?
		int cnt=0;
		
		for(int i=0;i<sign.length();i++) {
			for(int j=0;j<id.length();j++) {
				if(sign.charAt(i)==id.charAt(j)) {
					cnt++;
				}
			}
		}
		if(cnt>0) {
			System.out.println(cnt);
			System.out.println("특수문자 있음");
		}
	}

}
