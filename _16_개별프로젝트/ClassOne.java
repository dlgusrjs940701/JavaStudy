package _16_개별프로젝트;

public class ClassOne {
	private String className = null;
	private String classRoom = null;
	private String classTeacher = null;

//	public String getClassName() {
//		return className;
//	}
	public void setClassName(String className) {
		if(checkCname(className)=="YES") {
			this.className=className;
		}else if(className.isEmpty()) {
			System.out.println("과목명은 빌 수 없습니다.");
		}else {
			System.out.println("해당 과목명은 중복입니다.");
		}
	}

//	public String getClassRoom() {
//		return classRoom;
//	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

//	public String getClassTeacher() {
//		return classTeacher;
//	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	private String checkCname(String cName) {
		if (className==cName) {
			return "NO";
		} else {
			return "YES";
		}
	}

	public void prt() {
		System.out.println("과목명 : " + className);
		System.out.println("강의실 : " + classRoom);
		System.out.println("담당교수 : " + classTeacher);
	}
}
