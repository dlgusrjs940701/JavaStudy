package _24_상속_인터페이스;

import java.util.ArrayList;

public class WordDAO implements DBdao {

	public WordDAO() {
	}

	public void add(WordDTO wdto) {
		// TODO Auto-generated method stub

	}	

	@Override
	public ArrayList<WordDTO> selectAll() {
		ArrayList<WordDTO> w=new ArrayList<WordDTO>();
		WordDTO temp=new WordDTO();
		temp.setEng("apple");
		temp.setKor("바나나");
		w.add(temp);
		temp=new WordDTO();
		temp.setEng("banana");
		temp.setKor("바나나");
		w.add(temp);
		// TODO Auto-generated method stub
		return w;
	}

	@Override
	public void mod(WordDTO wdto) {
		// TODO Auto-generated method stub
		System.out.println("수정 : "+wdto.getEng()+" / "+wdto.getKor());
	}

	@Override
	public void delete(WordDTO wdto) {
		// TODO Auto-generated method stub
		System.out.println("삭제 : "+wdto.getEng());
	}


}
