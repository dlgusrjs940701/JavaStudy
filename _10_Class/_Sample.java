package _10_Class;

import java.util.Random;

public class _Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		Random r = new Random();
		Random r1 = r;
		Random r2 = null;
		Random r3 = new Random();
		System.out.println(r.nextInt(4));
		System.out.println(r1.nextInt(4));
//		System.out.println(r2.nextInt(4));
		System.out.println(r3.nextInt(4));
	}

}
