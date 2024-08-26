package _03반복문;

public class _08_for문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하시오.
		
		String test="abcdeabce"; // 선언문(자료형 변수=초기값)
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

	// 결론 : 변수는 test
    //       변수는 문자열의 값
    //       초기문자열은 "~~~"

    // 소문자가 아닌 대문자로 시작하는 자료형은 .(마침표)를 사용할 수 있다.
    // 예외 : 배열은 .(마침표)를 사용할 수 있다.
	// 원시타입 : int, char, boolean, double, float
	// 객체는 만들어진 어떠한 부품. 부품에 대한 사용방법이 있다.