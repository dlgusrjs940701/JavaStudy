package _20_With_oracle_미션;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class FoodManage {
	private ArrayList<FoodOne> fList = new ArrayList<>();

	FoodManage() {
		init();
	}

	private void init() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void list() {      // <<<<<<<<<<<<<공사중>>>>>>>>>>>>>
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
//			System.out.println("커넥션 자원 획득 성공");
			String sql = "select * from FoodOne";
			PreparedStatement pstmt = conn.prepareStatement(sql);
		for (int i = 0; i < fList.size(); i++) {
			fList.get(i).prt();
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close(); // 자원 반납
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

	public void mod() {
		Scanner in = new Scanner(System.in);
		FoodOne temp = new FoodOne();
		System.out.println("수정하고 싶은 음식 이름을 입력하세요.");
		String name = in.nextLine();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
//			System.out.println("커넥션 자원 획득 성공");
			String sql = "update FoodOne set name =? where name=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < fList.size(); i++) {
				int modName = check(name);
				if (modName == i) {
					System.out.println("수정될 음식이름으로 입력해주세요.");
					String name1 = in.nextLine();
					fList.get(i).setName(name1);
					pstmt.setString(1, name1);
					pstmt.setString(2, name);
					System.out.println("수정되었습니다.");
					int result = pstmt.executeUpdate();
					if (result == 0) {
						conn.rollback();
					} else {
						conn.commit();
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close(); // 자원 반납
				} catch (Exception e2) {
					// TODO: handle exception
				}
			} else {
				System.out.println("해당 음식은 등록되어 있지 않습니다. 다시 시도해주세요.");
			}
		}
	}

	public void delete() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 음식 이름을 입력하세요.");
		String name = in.nextLine();
		int deleteName = check(name);
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
//			System.out.println("커넥션 자원 획득 성공");
			String sql = "delete from FoodOne where name =?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			int result = pstmt.executeUpdate();
			if (result == 0) {
				conn.rollback();
			} else {
				conn.commit();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close(); // 자원 반납
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		if (deleteName == -1) {
			System.out.println("찾을 수 없습니다. 다시 시도해주세요.");
		} else {
			fList.remove(deleteName);
			System.out.println("삭제되었습니다.");
		}

	}

	public void add() {
		FoodOne temp = new FoodOne();
		Scanner in = new Scanner(System.in);
		System.out.println("좋아하는 음식 이름을 입력하세요.");
		String name = in.nextLine();
		temp.setName(name);
		int addName = check(name);
		Connection conn = null;
		if (addName == -1) {
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
//				System.out.println("커넥션 자원 획득 성공");
				String sql = "insert into FoodOne values(?, default)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, temp.getName());
				int result = pstmt.executeUpdate();
				if (result == 0) {
					conn.rollback();
				} else {
					conn.commit();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close(); // 자원 반납
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
			temp.setName(name);
			fList.add(temp);
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("이 음식은 이미 등록되어있습니다.");
		}

	}

	private int check(String name) {
		for (int i = 0; i < fList.size(); i++) {
			if (fList.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
