package 자바객체프로젝트;

public class companyIng {

	String cId=null;
	String cName=null;
	String cAge=null;
	String cJop=null;
	
	public void setcId(String cId) {
		this.cId=cId;
	}
	
	public void setcName(String cName) {
		this.cName=cName;
	}
	
	public void setcAge(String cAge) {
		this.cAge=cAge;
	}
	
	public void prt(){
		System.out.println("법인ID : "+cId);
		System.out.println("회사이름 : "+cName);
		System.out.println("직군 : "+cJop);
		System.out.println("-----------------");
	}
	
	
	public String getcId() {
		return cId;
	}
	
	public String getcJop() {
		return cJop;
	}
//	public void setmJop(String mJop) {
//		this.mJop=mJop;
//	}
}
