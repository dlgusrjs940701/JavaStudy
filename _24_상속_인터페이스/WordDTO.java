package _24_상속_인터페이스;

public class WordDTO {

	private String kor = null;
	private String eng = null;

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "WordDTO [kor=" + kor + ", eng=" + eng + "]";
	}

}
