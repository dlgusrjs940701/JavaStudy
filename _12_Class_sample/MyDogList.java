package _12_Class_sample;

public class MyDogList {

	Dog[] dogList = new Dog[5];
	// 다섯칸짜리의 배열을 만든다.

	MyDogList() {
		System.out.println("-- 강아지 관리 --");
		System.out.println(dogList[0]);
		if (dogList[0] != null) {
			System.out.println(dogList[0].name);
		}
		dogList[1] = new Dog();
		System.out.println(dogList[1]);
		dogList[2] = dogList[1];
		System.out.println(dogList[2]);
		dogList[3] = new Dog();
		System.out.println(dogList[3]);

		Dog dogList1 = new Dog();
		dogList[4] = dogList1;
		System.out.println(dogList1);
		System.out.println(dogList[4]);

		dogList[1].name = "abc";
		System.out.println(dogList[1].name);
		System.out.println(dogList[2].name);
		System.out.println(dogList[3].name);

		for (int i = 0; i < 5; i++) {
			if (dogList[i] != null) {
				System.out.println(dogList[i].name);
			}
		}
	}
}
