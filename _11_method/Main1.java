package _11_method;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMethod t=new testMethod();
		System.out.println(t.name);
		t.setName("hong");
		System.out.println(t.name);
		System.out.println(t.getName());
		String resultName=t.getName2("1121");
		if(resultName!=null) {
			System.out.println(resultName);
		}else {
			System.out.println("비번틀림");
		}
		t.setName("Lee");
		System.out.println(t.maskName("@@"));
	}

}
