package _04조별미션;

public class _특별1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
		// 숫자별로 수집된 수만큼 카운팅하세요.
		// 카운팅 배열은
		// int[] a=new int[10];
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0~9까지를 숫자로 정의한다.
		// 형변환은 사용하지 않는다. 메서드는 charAt()만 사용한다.
		String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		int[] count = new int [10];
		
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			if(c=='0') {
				count[0]++;
			}else if(c=='1') {
				count[1]++;
			}else if(c=='2') {
				count[2]++;
			}else if(c=='3') {
				count[3]++;
			}else if(c=='4') {
				count[4]++;
			}else if(c=='5') {
				count[5]++;
			}else if(c=='6') {
				count[6]++;
			}else if(c=='7') {
				count[7]++;
			}else if(c=='8') {
				count[8]++;
			}else if(c=='9') {
				count[9]++;
			}
		}
		for(int i=1;i<=9;i++) {
			System.out.println(i +":"+ count[i]);
		}
	}
}