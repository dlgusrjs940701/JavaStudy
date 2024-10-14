package _24_상속_인터페이스;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBdao dao = new WordDAO();
		WordMainFrame ws = new WordMainFrame(dao);
		
	}

}
