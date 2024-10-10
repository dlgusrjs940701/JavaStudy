package _23_상속_맵;

import java.util.ArrayList;

import _23_상속.Seok;
import _23_상속.StarUnit;
import _23_상속.ZZan;

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기서 게임을 진행한다.
		// 캐릭터 석을 선택 > 객체를 만든다
		ArrayList<StarUnit> starList = new ArrayList<>();

		StarUnit s1 = new Seok();
		s1.unitName = "석진";
		s1.hp = 6000;
		s1.attack = 100;
		starList.add(s1);

		Seok s2 = new Seok();
		s2.unitName = "홍길";
		s2.hp = 5500;
		s2.attack = 80;
		starList.add(s2);

		StarUnit z1 = new ZZan();
		z1.unitName = "짜장";
		z1.hp = 7000;
		z1.attack = 120;
		starList.add(z1);

		for (StarUnit s : starList) {
			System.out.println(s.toString());
			s.attack();
		}
	}

}
