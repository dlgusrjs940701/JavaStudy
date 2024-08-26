package _03반복문;

public class _01_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100부터 999까지의 숫자중에서 홀수만 출력하시오.
		for(int i=100;i<1000;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

}
