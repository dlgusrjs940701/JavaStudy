package _24_상속_인터페이스;

import java.util.ArrayList;

public interface DBdao {

	public void add(WordDTO wdto);

	public ArrayList<WordDTO> selectAll();

	public void mod(WordDTO wdto);

	public void delete(WordDTO wdto);
}
