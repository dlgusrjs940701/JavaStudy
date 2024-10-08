package _20_With_oracle_미션;

public class FoodOne {
	private String name = null;
	private String indate = null;

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public void prt() {
		System.out.println("좋아하는 음식 : " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
