package sample01;

public class Test02 {
	public static void main(String[] args) {
		int a = 10;
		char b = 'c';
		double c = 20;
		String d = "apple";
		
		System.out.println("a+10 : " +a+10);
		System.out.println("d+10 : " +d+10);

		c = a + 10/2;
		System.out.println("c : " +c);
		int k = a+a/4;
		System.out.println("k : " +k);
		
		int cc = a;
		a = a/3+2;
		cc= cc+a;
		System.out.println("cc : " +cc);
		
		a = 10;
		double p = 4;
		System.out.println("a/p : " +a/p);
		
		System.out.println(a==10);
		System.out.println(a!=10);
		System.out.println((a=a+1) == 10);
		
		
	}

}
