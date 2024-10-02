package _16_개별프로젝트;

public class StudentOne {
	private String sId = null;
	private String sName = null;
	private String sPhone = null;
	private int sGrade = 0;

	
	public String getsId() {
		return sId;
	}

	public boolean setsId(String sId) {
		if (checkId(sId) == true) {
			this.sId = sId;
		} else {
			System.out.println("해당 ID는 중복입니다");
		}
		return false;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String Name) {
		this.sName = Name;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String Phone) {
		this.sPhone = Phone;
	}

	public int getsGrade() {
		return sGrade;
	}

	public void setsGrade(int Grade) {
		this.sGrade = Grade;
	}

	private boolean checkId(String id) {
		for(int i=0;i<Student.sList.size();i++) {
			if(Student.sList.get(i).sId.equals(id)) {
				return false;
			}else {
				return true;
			}
		}
		return true;
	}

	public void prt() {
		System.out.println("학생의 ID : " + sId);
		System.out.println("학생의 이름 : " + sName);
		System.out.println("학생의 전화번호 : " + sPhone);
		System.out.println("학생의 학년 : " + sGrade);
	}

}
