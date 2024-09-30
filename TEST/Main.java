package 자바객체프로젝트;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainmenu mm = new Mainmenu();
		jobMenu jm = new jobMenu();
		companyMenu cm = new companyMenu();
		jobMain jm1 = new jobMain(); 
		employMent em=new employMent();
		companyIm ci=new companyIm();
		companyEm ce=new companyEm();
		
		mm.jm=jm;
		mm.cm=cm;
		jm.jm=jm1;
		jm.em=em;
		em.jm=jm1;
		cm.ci=ci;
		cm.ce=ce;
		ce.cm=ci;
		mm.menu();
//		jm.menu();
	}

}
