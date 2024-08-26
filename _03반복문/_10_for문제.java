package _03반복문;

public class _10_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 범인은 100부터 999까지 숫자중에 여러명이다.
		// 범인의 특징은 숫자의 각 자릿수를 더한 값이 짝수이다.
		// 범인의 숫자를 모두 찾으시오.
		for(int i=100;i<1000;i++) {
			int a = i/100;
			int aa = (i%10)/10;
			int aaa = i%10;
			if((a+aa+aaa)%2==0)
				System.out.println(i);	
		}
	}

}

