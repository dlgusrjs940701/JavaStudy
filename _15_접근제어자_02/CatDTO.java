package _15_접근제어자_02;

public class CatDTO {
	private String name=null;
	private int age=1;
	// 멤버변수는 접근제어자로 은닉화시킨다.
	// 은닉화 시키면 CatDTO 클래스 외부에서 변수에 참조를 어떻게 하는가?
	// 일단 은닉화 화고 멤버변수에 저장 및 인출에 관련 메서드를 만든다.. 
	// 저장하는 메서드를 setter 인출하는 메서드를 getter라고 부른다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		chkName(name);
		this.name = name;
	}
	private void chkName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
