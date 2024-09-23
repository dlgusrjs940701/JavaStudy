package _10_Class_미션2;

public class Event {
	
	String eName=null;
	String eText=null;
	
	public Event() {
		
	}
	
	public void prt() {
		System.out.println("이벤트 제목 : "+eName);
		System.out.println("이벤트 내용 : "+eText);
	}
	public void prt1() {
		System.out.println("진행 예정인 이벤트 : "+eName);
	}
}
