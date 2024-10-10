package _23_상속;

// SuperClass
public class StarUnit {
	public int hp=100;
	public int attack=10;
	public String unitName=null;
	
	public void attack() {
		System.out.println("공격점수 100점");
	}

	@Override
	public String toString() {
		return "StarUnit [hp=" + hp + ", attack=" + attack + ", unitName=" + unitName + "]";
	}
}
