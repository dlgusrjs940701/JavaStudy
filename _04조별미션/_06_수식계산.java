package _04조별미션;

public class _06_수식계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수식을 계산하는 프로그램을 작성하세요.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다.
		// 메서드는 최대한 적게 사용하세요.
		String a ="23-56+45*2-56";
		
		char sign='+';
		int result=0;
		String tempInt="";
		a=a+"+";
		
		for(int i=0;i<a.length();i++) {
			char temp=a.charAt(i);
			if(temp=='+'||temp=='-'||temp=='*') {
				int tempInteger=Integer.valueOf(tempInt);
				System.out.println(tempInteger);
				if(sign=='+') {
					result+=tempInteger;
				}else if(sign=='-') {
					result-=tempInteger;
				}else if(sign=='*') {
					result*=tempInteger;
				}
				sign=temp;
				tempInt="";
			}else {
				tempInt+=temp;
			}
		}
		System.out.println(result);
		
	}

}
