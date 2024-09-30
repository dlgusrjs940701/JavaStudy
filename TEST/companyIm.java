package 자바객체프로젝트;

import java.util.ArrayList;
import java.util.Scanner;

public class companyIm {

	ArrayList<companyIng> cpList = new ArrayList<>();
	ArrayList<companyEnd> employList = new ArrayList<>();


	companyIm() {
		
	}




	public void menu() {
		Scanner S = new Scanner(System.in);
		while (true) {
			System.out.println("<<< 구인중인 회사 관리 >>>");
			System.out.println();
			System.out.println("1. 회사 등록");
			System.out.println("2. 회사 삭제");
			System.out.println("3. 회사 수정");
			System.out.println("4. 구인중인 회사 전체보기");
			System.out.println("5. 뒤로");
			int a = S.nextInt();
			S.nextLine();
			if (a == 1) {
				cpAdd();
			} else if (a == 2) {
				cpDelete();
			} else if (a == 3) {
				cpMod();
			} else if (a == 4) {
				cpView();
			} else if (a == 5) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private void cpAdd() {
		Scanner S = new Scanner(System.in);
		companyIng cpTemp = new companyIng();
		

		System.out.println("회사등록을 선택하셨습니다. 회사의 법인ID를 입력해주세요.");
		String cId = S.nextLine();
		boolean id = checkId(cId);
		if (id == true) {
			System.out.println("회사의 법인ID는 이미 사용중입니다. 다시 입력해주세요.");
			return;
		} else {
			cpTemp.cId = cId;
			System.out.println("회사의 이름을 입력해주세요.");
			String cName = S.nextLine();
			cpTemp.cName = cName;
			System.out.println("1. 프론트엔드 ");
			System.out.println("2. 백엔드 ");
			System.out.println("3. 빅데이터 ");
			System.out.println("4. 인공지능 ");
			System.out.println("5. 인사팀 ");
			int num = S.nextInt();
			S.nextLine();
			if (num == 1) {
				cpTemp.cJop = "프론트엔드";
				System.out.println("등록되었습니다.");
			} else if (num == 2) {
				cpTemp.cJop = "백엔드";
				System.out.println("등록되었습니다.");
			} else if (num == 3) {
				cpTemp.cJop = "빅데이터";
				System.out.println("등록되었습니다.");
			} else if (num == 4) {
				cpTemp.cJop = "인공지능";
				System.out.println("등록되었습니다.");
			} else if (num == 5) {
				cpTemp.cJop = "인사팀";
				System.out.println("등록되었습니다.");
			} else {
				System.out.println("다시 시도해주세요.");
			}

			cpList.add(cpTemp);
			
		}

	}


	private void cpDelete() {
		Scanner S = new Scanner(System.in);
		System.out.println("회사삭제를 선택하셨습니다. 회사의 법인ID를 입력해주세요.");
		String cId = S.nextLine();

		boolean id = checkId(cId);
		for (int i = 0; i < cpList.size(); i++) {
			if (id == true) {
				System.out.println("회사의 이름도 입력해주세요.");
				String cName = S.nextLine();
				boolean name = checkName(cName);
				if (name == true) {
					cpList.remove(i);
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("회사의 이름을 찾을 수 없습니다. 다시 시도해주세요.");
				}
			} else {
				System.out.println("법인ID를 찾을 수 없습니다. 다시 시도해주세요.");
			}
		}
	}

	private void cpMod() {
		Scanner S = new Scanner(System.in);
		companyEnd cpTemp = new companyEnd();
		System.out.println("회사정보 수정을 선택하셨습니다.");
		System.out.println();
		System.out.println("1. 회사의 구인상태 변경");
		System.out.println("2. 회사의 기본 정보");
		System.out.println("3. 뒤로");
		int a = S.nextInt();
		S.nextLine();
		if (a == 1) {
			System.out.println("구인중인 회사의 정보를 수정하겠습니다.");
			System.out.println("상태를 구인완료로 변경하려는 회사의 법인ID를 입력해주세요.");
			String cId = S.nextLine();
			for (int i = 0; i < cpList.size(); i++) {
				boolean id = checkId(cId);
				if (id == true) {
					System.out.println("회사의 이름을 입력하세요.");
					String cName = S.nextLine();
					boolean name = checkName(cName);
					if (name == true) {
						System.out.println("변경되었습니다.");
						cpTemp.cId = cId;
						cpTemp.cName = cName;
						cpList.remove(i);
						employList.add(cpTemp);
					}
				}
			}
		} else if (a == 2) {
			System.out.println("회사의 기본 정보를 수정하겠습니다. 회사의 기존 법인ID를 입력해주세요.");
			String cId = S.nextLine();
			for (int i = 0; i < cpList.size(); i++) {
				if (cpList.get(i).cId.equals(cId)) {
					System.out.println("입력하신 회사의 법인ID를 수정하겠습니다. 법인ID를 입력해주세요.");
					String cId1 = S.nextLine();
					cpList.get(i).setcId(cId1);
					System.out.println("회사의 이름을 수정하겠습니다. 이름을 입력해주세요.");
					String cName = S.nextLine();
					cpList.get(i).setcName(cName);
				} else {
					System.out.println("찾을 수 없습니다. 다시 시도해주세요.");
				}
			}
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}

	private void cpView() {
		System.out.println("구인중인 회사 전체보기를 선택하셨습니다.");
		for (companyIng cpTemp : cpList) {
			cpTemp.prt();
		}
	}

	// 아이디 찾기
	public boolean checkId(String cId) {
		for (int i = 0; i < cpList.size(); i++) {
			if (cpList.get(i).cId.equals(cId)) {
				return true;
			} else if (cpList.get(i).cId == null) {
				return false;
			}
		}
		return false;

	}

	// 이름 찾기
	public boolean checkName(String cName) {
		for (int i = 0; i < cpList.size(); i++) {
			if (cpList.get(i).cName.equals(cName)) {
				return true;
			} else if (cpList.get(i).cName == null) {
				return false;
			}
		}
		return false;
	}
}
