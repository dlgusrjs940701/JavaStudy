package _17_수강신청관리;

import java.util.ArrayList;
import java.util.Scanner;

// 요구사항에서 학생을 관리하는 내용을 추상화
public class StuMge {
	
	private ArrayList<Stu> slist =
			new ArrayList<>();
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.전체보기");
			System.out.println("4.삭제");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 3) {
				list();
			}else if(selNum == 4) {
				delete();
			}else {
				break;
			}
		}
	}
	private void list() {
		for(int i=0; i<slist.size(); i++) {
			slist.get(i).prt();
		}
	}
	private void add() {
		Scanner in = new Scanner(System.in);
		Stu newTemp = new Stu();
		System.out.println("아이디입력");
		String id = in.nextLine();
		int resultValue = findID(id);
		if(resultValue == -1) {
			System.out.println("이름입력");
			String name = in.nextLine();
			newTemp.setId(id);
			newTemp.setName(name);
			slist.add(newTemp);			
		}else {
			System.out.println(id+" 는 사용중");
		}
		
	}
	private void search() {
		
	}
	//private 리턴타입? findID( 매개변수? ){
	private int findID(String d){
		for(int i=0; i<slist.size(); i++) {
			if(slist.get(i).getId().equals(d)) {
				return i;
			}
		}
		return -1;
	}	
	public Stu loginID(String id) {
		int idx = findID(id);
		if(idx != -1) {
			return slist.get(idx);
		}
		return null;
	}
	private void delete() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제 아이디 입력");
		String delId = in.nextLine();
		int returnValue = findID(delId);
		if(returnValue != -1) {
			slist.remove(returnValue);
			System.out.println("삭제 됨");
		}
		// for문은 아이디를 찾는 반복문 
		// 아이디를 찾는 다는 것은. 검색이나 입력에서도 응용할수있다.
		// 그래서 이 코드의 재사용성을 높이기 위해서 메서드 분리
		
	}
}
