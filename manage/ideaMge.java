package manage;

import java.util.ArrayList;
import java.util.Scanner;

import dao.ideaDAO;
import dto.ideaDTO;

public class ideaMge {
	ideaDAO idao = new ideaDAO();

	public void menu() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 아이디어 제안");
			System.out.println("2. 아이디어 수정");
			System.out.println("3. 아이디어 삭제");
			System.out.println("4. 아이디어 전체보기");
			System.out.println("5. 아이디어 검색");
			System.out.println("6. 종료");
			System.out.println("메뉴선택");
			int selNum = in.nextInt();
			if (selNum == 1) {
				ideaAdd();
			} else if (selNum == 2) {
				ideaMod();
			} else if (selNum == 3) {
				ideaDel();
			} else if (selNum == 4) {
				ideaList();
			} else if (selNum == 5) {
				ideaSearch();
			} else if (selNum == 6) {
				break;
			}
		}
	}

	private void ideaAdd() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("제목을 입력");
		String name = in.nextLine();
		System.out.println("설명을 입력");
		String memo = in.nextLine();
		System.out.println("작성자를 입력");
		String author = in.nextLine();

		ideaDTO idto = new ideaDTO();
		idto.setName(name);
		idto.setMemo(memo);
		idto.setAuthor(author);

		idao.add(idto);
	}

	private void ideaMod() {
		// TODO Auto-generated method stub
		ArrayList<ideaDTO> i = idao.selectAll();
		for (ideaDTO tempi : i) {
			System.out.println(tempi.toString());
		}

		Scanner in = new Scanner(System.in);
		System.out.println("수정할 아이디어의 번호를 입력하세요.");
		String id = in.nextLine();
		ideaDTO idto = idao.select(id);
		if (idto != null) {
			System.out.println("수정할 정보는 다음과 같습니다.");
			System.out.println(idto.toString());
			System.out.println("수정 제목을 입력해주세요");
			String name = in.nextLine();
			idto.setName(name);
			System.out.println("수정 설명을 입력해주세요");
			String memo = in.nextLine();
			idto.setMemo(memo);

			idao.update(idto);
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("아이디어를 찾을 수 없습니다.");
		}
	}

	private void ideaDel() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("삭제 아이디 입력");
		String delId = in.nextLine();
		idao.delete(delId);
	}

	private void ideaList() {
		// TODO Auto-generated method stub
		ArrayList<ideaDTO> i = idao.selectAll();
		System.out.println(i.size() + " 개의 아이디어가 있습니다.");
		for (ideaDTO idto : i) {
			System.out.println(idto.toString());
		}
	}

	private void ideaSearch() { // 공사중
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	}

}
