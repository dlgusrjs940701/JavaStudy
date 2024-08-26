package _05반복문2;

public class _00_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문에서 break, continue 사용
		// break는 현재 반복문을 종료할 때 사용
		// continue는 더 이상 코드를 실행하지 않고
		// 증감식으로 넘어가서 조건을 판별한다
		
		// 예시1)
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
	}

}
