package 자바객체프로젝트;


public class job_Manage {

	String mId=null;
	String mName=null;
	String mAge=null;
	String mJop=null;
	
	public void setmId(String mId) {
		this.mId=mId;
	}
	
	public void setmName(String mName) {
		this.mName=mName;
	}
	
	public void setmAge(String mAge) {
		this.mAge=mAge;
	}
	
	public void prt(){
		System.out.println("ID : "+mId);
		System.out.println("이름 : "+mName);
		System.out.println("나이 : "+mAge);
		System.out.println("직군 : "+mJop);
		System.out.println("-----------------");
	}
}
