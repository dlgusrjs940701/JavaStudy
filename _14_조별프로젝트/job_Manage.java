package _14_조별프로젝트;

public class job_Manage {

	String mId=null;
	String mName=null;
	String mAge=null;
	jobMenu jMn=null;
	
	public void view() {
		System.out.println("회원의 아이디 : "+mId);
		System.out.println("회원의 이름 : "+mName);
		System.out.println("회원의 나이 : "+mAge);
		System.out.println("---------------------");
	}
	
	public void setmId(String mId) {
		this.mId=mId;
	}
	
	public void setmName(String mName) {
		this.mName=mName;
	}
	
	public void setmAge(String mAge) {
		this.mAge=mAge;
	}
}
