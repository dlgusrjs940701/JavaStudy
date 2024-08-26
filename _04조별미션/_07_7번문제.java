package _04조별미션;

public class _07_7번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 철수는 배열의 0번 인덱스부터 순회한다.
		// 0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
		// 이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치될것이다.
		// 위와 같은 방식으로 가장 큰 수를 구하시오.
		int[] a = {34,2,35,8,31,45};
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
			}
		}
		System.out.println(a[a.length-1]);	
	}
}
