package _16_Static_final;

public class MemberADM {

	public String name = null;
	public static String companyName = "Human";
	public static final String teamName = "KimTeam";

	MemberADM() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 MemberADM" + "생성자 실행");
	}

	public static void prt() {
//		System.out.println(name);
	}
}
