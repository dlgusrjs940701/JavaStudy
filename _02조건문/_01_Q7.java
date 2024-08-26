package _02조건문;

public class _01_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {45,34,64};
		int maxValue=0;
		int maxIndex=0;		
		
		int temp=a[0]/10+a[0]%10;
		if(maxValue < temp) {
			maxValue = temp;
			maxIndex=0;
		}
		temp=a[1]/10+a[1]%10;
		if(maxValue < temp) {
			maxValue = temp;
			maxIndex=1;
		}
		temp=a[2]/10+a[2]%10;
		if(maxValue < temp) {
			maxValue = temp;
			maxIndex=2;
		}
		System.out.println(maxIndex);
	}

}
