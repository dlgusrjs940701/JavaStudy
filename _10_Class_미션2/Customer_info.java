package _10_Class_미션2;

public class Customer_info {

	String cId = null;
	String cName = null;

	public void setcId(String id) {
		cId = id;
	}

	public void setcName(String name) {
		cName = name;
	}

	public void prt() {
		System.out.println(" 고객의 ID : " + cId);
		System.out.println(" 고객의 이름 : " + cName);
	}
}
