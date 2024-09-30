package 자바객체프로젝트;

import java.util.ArrayList;
import java.util.Scanner;

public class jobMain {

	ArrayList<job_Manage> memberList = new ArrayList<>();
	ArrayList<employMent_Manage> employList = new ArrayList<>();
	companyIng temp = null;

	

	jobMain() {
//		menu();
	}



	public void menu() {
		Scanner S = new Scanner(System.in);
		while (true) {
			System.out.println("<<< 구직중인 회원 관리 >>>");
			System.out.println();
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 삭제");
			System.out.println("3. 회원 수정");
			System.out.println("4. 구직중인 회원 전체보기");
			System.out.println("5. 뒤로");
			int a = S.nextInt();
			S.nextLine();
			if (a == 1) {
				memberAdd();
			} else if (a == 2) {
				memberDelete();
			} else if (a == 3) {
				memberMod();
			} else if (a == 4) {
				memberView();
			} else if (a == 5) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private void memberAdd() {
		Scanner S = new Scanner(System.in);
		job_Manage memberTemp = new job_Manage();
		

		System.out.println("회원등록을 선택하셨습니다. 회원의 ID를 입력해주세요.");
		String mId = S.nextLine();
		boolean id = checkId(mId);
		if (id == true) {
			System.out.println("회원의 ID는 이미 사용중입니다. 다시 입력해주세요.");
			return;
		} else {
			memberTemp.mId = mId;
			System.out.println("회원의 이름을 입력해주세요.");
			String mName = S.nextLine();
			memberTemp.mName = mName;
			System.out.println("회원의 나이를 입력해주세요.");
			String mAge = S.nextLine();
			memberTemp.mAge = mAge;
			System.out.println("1. 프론트엔드 ");
			System.out.println("2. 백엔드 ");
			System.out.println("3. 빅데이터 ");
			System.out.println("4. 인공지능 ");
			System.out.println("5. 인사팀 ");
			int num = S.nextInt();
			S.nextLine();
			if (num == 1) {
				memberTemp.mJop = "프론트엔드";
				System.out.println("등록되었습니다.");
			} else if (num == 2) {
				memberTemp.mJop = "백엔드";
				System.out.println("등록되었습니다.");
			} else if (num == 3) {
				memberTemp.mJop = "빅데이터";
				System.out.println("등록되었습니다.");
			} else if (num == 4) {
				memberTemp.mJop = "인공지능";
				System.out.println("등록되었습니다.");
			} else if (num == 5) {
				memberTemp.mJop = "인사팀";
				System.out.println("등록되었습니다.");
			} else {
				System.out.println("다시 시도해주세요.");
			}

			memberList.add(memberTemp);
			
		}

	}


	private void memberDelete() {
		Scanner S = new Scanner(System.in);
		System.out.println("회원삭제를 선택하셨습니다. 회원의 ID를 입력해주세요.");
		String mId = S.nextLine();

		boolean id = checkId(mId);
		for (int i = 0; i < memberList.size(); i++) {
			if (id == true) {
				System.out.println("회원의 이름도 입력해주세요.");
				String mName = S.nextLine();
				boolean name = checkName(mName);
				if (name == true) {
					memberList.remove(i);
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("회원의 이름을 찾을 수 없습니다. 다시 시도해주세요.");
				}
			} else {
				System.out.println("ID를 찾을 수 없습니다. 다시 시도해주세요.");
			}
		}
	}

	private void memberMod() {
		companyIng temp1 = new companyIng();
		Scanner S = new Scanner(System.in);
		employMent_Manage memberTemp = new employMent_Manage();
		System.out.println("회원수정을 선택하셨습니다.");
		System.out.println();
		System.out.println("1. 회원의 구직상태 변경");
		System.out.println("2. 회원의 기본 정보");
		System.out.println("3. 뒤로");
		int a = S.nextInt();
		S.nextLine();
		if (a == 1) {
			System.out.println("구직중인 회원의 정보를 수정하겠습니다.");
			System.out.println("상태를 취업완료로 변경하려는 회원의 ID를 입력해주세요.");
			String mId = S.nextLine();
			for (int i = 0; i < memberList.size(); i++) {
				boolean id = checkId(mId);
				if (id == true) {
					System.out.println("회원의 이름을 입력하세요.");
					String mName = S.nextLine();
					boolean name = checkName(mName);
					if (name == true) {
						System.out.println("변경되었습니다.");
						memberTemp.mId = mId;
						memberTemp.mName = mName;
							memberList.remove(i);
							employList.add(memberTemp);	
					}
				}
			}
		} else if (a == 2) {
			System.out.println("회원의 기본 정보를 수정하겠습니다. 회원의 기존ID를 입력해주세요.");
			String mId = S.nextLine();
			for (int i = 0; i < memberList.size(); i++) {
				if (memberList.get(i).mId.equals(mId)) {
					System.out.println("입력하신 회원의 ID를 수정하겠습니다. ID를 입력해주세요.");
					String mId1 = S.nextLine();
					memberList.get(i).setmId(mId1);
					System.out.println("회원의 이름을 수정하겠습니다. 이름을 입력해주세요.");
					String mName = S.nextLine();
					memberList.get(i).setmName(mName);
					System.out.println("회원의 나이를 수정하겠습니다. 나이를 입력해주세요.");
					String mAge = S.nextLine();
					memberList.get(i).setmAge(mAge);
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("찾을 수 없습니다. 다시 시도해주세요.");
				}
			}
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}

	private void memberView() {
		System.out.println("구직중인 회원 전체보기를 선택하셨습니다.");
		for (job_Manage memberTemp : memberList) {
			memberTemp.prt();
		}
	}

	// 아이디 찾기
	public boolean checkId(String mId) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).mId.equals(mId)) {
				return true;
			} else if (memberList.get(i).mId == null) {
				return false;
			}
		}
		return false;

	}

	// 이름 찾기
	public boolean checkName(String mName) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).mName.equals(mName)) {
				return true;
			} else if (memberList.get(i).mName == null) {
				return false;
			}
		}
		return false;
	}
	
	
}
