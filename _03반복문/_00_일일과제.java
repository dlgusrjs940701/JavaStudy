package _03반복문;

public class _00_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제1 (1부터 100까지의 숫자 중 홀수는 더하고 짝수는 뺀 결과값)
		int sum1 = 0;
		for(int i = 1; i<101;i++) {
			if(i%2==1) {
				sum1+=i;
			}
			if(i%2==0) {
				sum1-=i;
			}
		}
		System.out.println(sum1);
		
		//문제2 (1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값, 짝수는 짝수끼리 더한값)
		int sum2 = 0;
		int sum3 = 0;
		for(int i = 1; i<101; i++) {
			if(i%2==1) {
				sum2+=i;
			}
			if(i%2==0) {
				sum3+=i;
			}
		}
		System.out.println(sum2+"/"+sum3);
		
		//문제3 (1부터 100까지 숫자 중 홀수는 모두 몇 개?)
		int sum4Count = 0;
		for(int i = 1;i<101;i++) {
			if(i%2==1) {
				sum4Count++;
			}
		}
		System.out.println(sum4Count);
		
		//문제4 (100부터 999까지의 숫자의 모든 숫자의 합)
		int score = 0;
		for(int i = 100;i<1000;i++) {
			int sum5 = (i/100)%10;
			int sum6 = (i/10)%10;
			int sum7 = i%10;
			score = sum5 + sum6 + sum7;
		}
		System.out.println(score);
		
		//문제5 (범인은 100부터 999까지 숫자에 숨어있는데 범인은 십의 자리에 있고, 3의 배수)
		for(int i = 100; i<1000;i++) {
			if((i/10%10)%3==0) {
				System.out.println(i);
			}
		}
		;
		
		//문제6 (범인을 찾는데 합한 값이 44를 넘어가게 하는 숫자 한개가 범인)
		int num = 0;
		int x = 0;
		for(int i = 0; i<101;i++) {
			num += i;
			if(num<44) {
				x = i;
			}
		}
		System.out.println(x+1);
		
		//문제7 (ln이 빠지면 i 변수 값을 출력 후 줄바꿈을 하지 않는 코드이다.)
//		System.out.println("abc");
//		System.out.println("def");
//		
//		System.out.print("abc");
//		System.out.print("def");
		int sumscore = 0;
		for(int i = 1; i<11; i++) {
			sumscore += i;
			if(i<10) {
				System.out.print(i+"+");
			}
			if(i==10) {
				System.out.print("10"+"="+sumscore);
			}
		}
		System.out.println();
		
		//문제8 (피보나치 수열1)
		int fib = 1;
		int fib1 = 0;
		int fibSum = 0;
		for(int i = 1; i<8; i++) {
			fibSum+=fib;
			fib = fib+fib1;
			fib1 = fib-fib1;
		}
		System.out.println(fibSum);
		
		//문제9
		
		int bInt = 0;
		for(int i = 1; i<20;) {
			System.out.println(i);
			int temp=i;  // 현재 i값 백업
			i=bInt+i;   // 다음 i값
			bInt=temp;   // 이전 bInt에 현재 i값 저장
		}
		
		
		//문제10
		int aaa=987654321;
		int sum=0;
		for( ;aaa>0;) {
			sum+=(sum%10);
			aaa/=10;
			aaa=aaa/10;
//			sum=sum+aaa%10;
//			aaa=aaa/10;
		}
		System.out.println(sum);
	}
}
