package _04조별미션;

public class _03_비밀편지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// letter 배열의 암호를 풀어서 편지의 내용을 출력하시오.
		
		String word ="gehoudfkimjnlvy";
		int[] letter={8,12,3,13,1,14,3,4};
		String result="";
		
		for(int index:letter) {
			// System.out.println(index);
			// letter 배열의 요소가 index변수에 순차적으로 할당
			result+=word.charAt(index);
		}
		System.out.println(result);
	}

}
