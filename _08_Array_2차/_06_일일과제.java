package _08_Array_2차;

public class _06_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
					{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25}
									};
		int rowMin = 1;
		int rowMax = 3;
		int colMin = 1;
		int colMax = 4;
		int num=1;
		int rows=a.length;
		int cols=a[0].length;
		
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=num++;
				if(j==0) {
					a[i][0]=a[i+1][0];
				}
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
