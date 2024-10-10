package _23_상속미션;

public class zooInfo {
	public String name=null;
	public int age=0;
	public int weight=0;
	
	public void eat() {
		System.out.println("먹이를 준다");
	}

	@Override
	public String toString() {
		return "zooInfo [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
}
