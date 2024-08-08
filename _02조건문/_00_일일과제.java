package _02조건문;

public class _00_일일과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1
		double score = 89.2;
		if(score >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 문제2
		int level = 1;
		int point = 30;
		
		if(level==1) {
			point += 30;
		}else {
			point +=10;
		}
		System.out.println(point);
		
		// 문제3
		int[] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2]+80);
		
		// 문제4
		if(lotto[3]%2==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		// 문제5
		int k = 0;
		if(lotto[0]%2==1) {
			k += lotto[0];
		}
		if(lotto[1]%2==1) {
			k += lotto[1];
		}
		if(lotto[2]%2==1) {
			k += lotto[2];
		}
		if(lotto[3]%2==1) {
			k += lotto[3];
		}
		if(lotto[4]%2==1) {
			k += lotto[4];
		}
		if(lotto[5]%2==1) {
			k += lotto[5];
		}
		System.out.println(k);
		
		//문제6
		int[] a = {45,34,64,45,24};
		System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
		
		
		//문제7
		int[] aa = {45,34,64};
		int aa1 = (aa[0]/10) + (aa[0]%10);
		int aa2 = (aa[1]/10) + (aa[1]%10);
		int aa3 = (aa[2]/10) + (aa[2]%10);
		
		if(aa1 > aa2 && aa1 > aa3) {
			System.out.println(aa[0]);
		}else if(aa2 > aa1 && aa2 > aa3) {
			System.out.println(aa[1]);
		}else {
			System.out.println(aa[2]);
		}
		
		//문제8
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		int[] bullet = {3,2};
		
		double cBullet = bullet[1]/bullet[0];
		double bird0 = y[0]/x[0];
		double bird1 = y[1]/x[1];
		double bird2 = y[2]/x[2];
		if(cBullet==bird0) {
			System.out.println("0번 새");
		}
		if(cBullet==bird1) {
			System.out.println("1번 새");
		}
		if(cBullet==bird2) {
			System.out.println("2번 새");
		}
		
		
		//문제9
		int[] enemy = {10, 20};
		int[] boom = {11, 5};
		int[] enemySize = {5,6};
		int[] boomSize = {2,2};
		
		int[] enemyBody = {enemy[0]+-enemySize[0], enemy[1]+-enemySize[1]};
		int[] boomBody = {boom[0]+-boomSize[0], boom[1]+-boomSize[1]};
		
		if(boomBody[1] > 10) {
			boomBody[1] += 1;
		}else if(boomBody[1] > 11) {
			boomBody[1] += 1;
		}else if(boomBody[1] > 12) {
			boomBody[1] += 1;
		}else if(boomBody[1] > 13) {
			boomBody[1] += 1;
		}else if(boomBody[1] > 14) {
			boomBody[1] += 1;
		}else if(boomBody[1] > 15) {
			boomBody[1] += 1;
		}
		if(boomBody==enemyBody) {
			System.out.println("Hit");
		}
		
		
		
		
		
	}
}
