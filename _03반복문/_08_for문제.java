package _03반복문;

public class _08_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하시오.
		String test="abcdeabce";
		int count=0;
		for(int i=0;i<9;i++) {
			char aaa=test.charAt(i);
			if(aaa=='a') {
				count++;
			}
			
			System.out.println(aaa);
		}
		System.out.println("a의 개수 : " +count);
	}

}
