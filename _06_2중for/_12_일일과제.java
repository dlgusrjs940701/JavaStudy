package _06_2중for;

public class _12_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11번 문제에서 for문 2개만 사용하기 
		// if문은 갯수 상관없음
		
		for(int i=0; i<7; i++) {
			for(int k=0;k<7;k++) {
				if(i==0&&k==3) {
					System.out.print("0");
				}else if(k>=3-i) {
					System.out.print("*");
				}
			System.out.println();
			}
		}
	}
}	
