package _21_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _21_dto.FishDTO;


// fishdata table CRUD
public class FishDAO {

	private String username = "root";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private Connection conn = null;	// 커넥션 자원 변수
	public static FishDAO fishdao=null; // 자기 자신의 객체 주소변수
	
	private FishDAO() {
		init();
	}
	
	public static FishDAO getInstance() {
		if(fishdao==null) {
			fishdao=new FishDAO();
		}
		return fishdao;
	}
	private void init() { // 드라이보 로드
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private boolean conn() { // 커넥션 가져오는 공통 코드를 메서드로 정의
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", // 아이디
					"11111111");
			System.out.println("커넥션 자원 획득 성공");
			return true; // 커넥션 자원을 정상적으로 획득한 경우
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false; // 커넥션 자원을 획흑하지 못한 경우.

	}

	public ArrayList<FishDTO> selectAll() {
		ArrayList<FishDTO> flist = new ArrayList<>();
		if (conn()) {
			try {
				String sql = "select * from fishdata";
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				// ResultSet은 테이블 형식으로 가져온다고 이해하면 된다!!
				while (rs.next()) { // next() 메서드는 rs에서 참조하는 테이블에서
									// 튜플을 순차적으로 하나씩 접근하는 메서드
					FishDTO fishTemp = new FishDTO();
					fishTemp.setId(rs.getString("id"));
					fishTemp.setPwd(rs.getString("pwd"));
					fishTemp.setIndate(rs.getString("indate"));
					flist.add(fishTemp);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {

				}
			}

		}

		return flist;
	}

	public FishDTO selecOne(String findId) {
		if (conn()) {
			try {
				String sql = "select * from fishdata where id = ?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, findId);
				ResultSet rs = psmt.executeQuery();
				if (rs.next()) {
					FishDTO fishTemp = new FishDTO();
					fishTemp.setId(rs.getString("id"));
					fishTemp.setPwd(rs.getString("pwd"));
					fishTemp.setIndate(rs.getString("indate"));
					return fishTemp;
				}
			} catch (Exception e) {

			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {

				}
			}
		}
		return null;
	}

	public void delete(String delId) {
		if (conn()) {
			try {
				String sql = "delete from fishdata where id=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, delId);
				psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {

				}
			}
		}
	}

	public void add(FishDTO fdto) {
		if (conn()) {
			try {
				String sql = "insert into fishdata values(?,?,default)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, fdto.getId());
				psmt.setString(2, fdto.getPwd());

				// 쿼리 실행
				psmt.executeUpdate();

				// 쿼리 실행 리턴을 받아서 다음 처리 작업 정의
				int resultInt = psmt.executeUpdate();
				if (resultInt > 0) {
					conn.commit(); // 트랜잭션 처리
				} else {
					conn.rollback(); // 트랜잭션 처리
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {

				}
			}

		} else {
			System.out.println("데이터베이스 커넥션 실패");
		}
	}

	public void update(FishDTO fdto) {
		// TODO Auto-generated method stub
		if (conn()) {
			try {
				String sql = "update fishdata set pwd=? where id=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, fdto.getPwd());
				psmt.setString(2, fdto.getId());
				psmt.executeUpdate();
			} catch (SQLException e) {

			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {

				}
			}
		}
	}
}
