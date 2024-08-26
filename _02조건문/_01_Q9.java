package _02조건문;

public class _01_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monsterX=10;
		int monsterY=20;
		int monsterWidth=5;
		int monsterHeight=6;
		
		int missileX=11;
		int missileY=18;
		int missileSize=2;
		
		//미사일 y좌표 조정
		int missileY2=missileY+2;
		System.out.println(missileY2);
		
		//미사일의 X 좌표가 곁치는지 판별
		//미사일의 X 좌표 (missileX)와 몬스트와 닿는 지점(조정필요 왼쪽으로는 미사일 사이즈만큼 줄이고 . 오른쪽으로는 몬스터 가로 사이즈와 미사일 사이즈 만큼 조정)
		System.out.println(((monsterX-missileSize)<=missileX) && ((monsterX+monsterWidth+missileSize)>=missileX));
		
		//미사일의 Y 좌표가 곁치는지 판별
		//미사일의 Y 좌표를 정정할 필요 있음. 미사일은 직진이므로 미사일의 윗 부분에 맞는다. 그래서 missilY2로 조정
		System.out.println((monsterY <= missileY2) && (monsterY+monsterHeight >= missileY2));
		
		// 최종 판단
		System.out.println((((monsterX-missileSize)<=missileX) && ((monsterX+monsterWidth+missileSize)>=missileX)) &&
				  			((monsterY <= missileY2) && (monsterY+monsterHeight >= missileY2)));

	}

}
