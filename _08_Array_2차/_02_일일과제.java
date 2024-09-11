package _08_Array_2차;

public class _02_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][5];
		int num=1;
		int row=a.length;
		int col=a[0].length;
		
//		문제2
		
		for(int i=row-1;i>=0;i--) {
			for(int j=col-1;j>=0;j--) {
				a[i][j]=num;
				num++;
			}
		
		}
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
