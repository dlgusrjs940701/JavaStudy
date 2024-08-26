package _01Array;

public class _00_일일과제 {

	public static void main(String[] args) {
		// 문제1
		int[] number = new int[5];
		number[0] = 30;
		number[1] = 40;
		number[2] = 50;
		number[3] = 60;
		number[4] = 55;
		System.out.println(number[0]+"/"+number[1]+"/"+number[2]+"/"+number[3]+"/"+number[4]);
		// TODO Auto-generated method stub

		//문제2
		String[] content = new String[3];
		content[0] = "kim";
		content[1] = "lee";
		content[2] = "park";
		System.out.println(content[0]+"/"+content[1]+"/"+content[2]);
		
		//문제3
		int[] lotto = {6,12,33,4,5,26};
		
		System.out.println(lotto[2]+2);
		
		//문제4
		System.out.println(lotto[0]+lotto[2]+lotto[4]); 
		
		//문제5
		lotto[0] = lotto[0];
		lotto[1] += lotto[0];
		lotto[2] += lotto[1];
		lotto[3] += lotto[2];
		lotto[4] += lotto[3];
		lotto[5] += lotto[4];
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		
		//문제6
		System.out.println(lotto[3]%2==0);
		
		//문제7
		int money = 2750;
		int pay = 10000;
		int remain = pay-money;
		int[] remainmoney = new int[3];
		remainmoney[0] = (remain/1000)%1000;
		remainmoney[1] = (remain/1000)%100;
		remainmoney[2] = (remain/100)%10;
		System.out.println("천원: "+remainmoney[0]+ "개"+" 백원: "+remainmoney[1]+ "개"+" 십원: "+remainmoney[2]+"개");
		
		//문제8
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 150;
		
	
		System.out.println((xC>xA)&&(yC>yB));
	}

}
