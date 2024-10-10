package _23_상속_맵;

import java.util.ArrayList;

import _23_상속미션.Mon;
import _23_상속미션.Ti;
import _23_상속미션.zooInfo;

public class zooPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<zooInfo> zList = new ArrayList<>();
		zooInfo z = new Ti();
		z.name = "호돌이";
		z.age = 1;
		zList.add(z);
		z = new Ti();
		z.name = "호순이";
		z.age = 2;
		zList.add(z);
		z = new Mon();
		z.name = "숭이";
		z.age = 3;
		zList.add(z);

		for (zooInfo zz : zList) {
			zz.eat();
		}
		for (zooInfo zz : zList) {
			System.out.println(zz.toString());
		}
	}

}
