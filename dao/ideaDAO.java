package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ideaDTO;

public class ideaDAO {

	private String username = "root";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private Connection conn = null;

	public ideaDAO() {
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private boolean conn() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
			System.out.println("커넥션 자원 획득 성공");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public ArrayList<ideaDTO> selectAll() {
		ArrayList<ideaDTO> ilist = new ArrayList<>();
		if (conn()) {
			try {
				String sql = "select * from ideastore";
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				while (rs.next()) {
					ideaDTO ideaTemp = new ideaDTO();
					ideaTemp.setint(rs.getInt("id"));
					ideaTemp.setName(rs.getString("name"));
					ideaTemp.setMemo(rs.getString("memo"));
					ideaTemp.setAuthor(rs.getString("author"));
					ilist.add(ideaTemp);
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
		return ilist;
	}

	public ideaDTO selectOne(String selId) {
		if (conn()) {
			try {
				String sql = "select * from ideastore where id = ?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, selId);
				ResultSet rs = psmt.executeQuery();
				if (rs.next()) {
					ideaDTO iTemp = new ideaDTO();
					iTemp.setint(rs.getInt("id"));
					iTemp.setName(rs.getString("name"));
					iTemp.setMemo(rs.getString("memo"));
					iTemp.setAuthor(rs.getString("author"));
					return iTemp;
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
	public ArrayList<ideaDTO> select(String sw){
		ArrayList<ideaDTO> ilist = new ArrayList<ideaDTO>();
		if(conn()) {
			try {
				String sql="select * from ideastore where "+
						"name like '%"+sw+"%'";
				System.out.println(sql);
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs =psmt.executeQuery();
				//Resultset은 테이블 형식으로 가져온다고 이해합니다.
				while(rs.next()) {  //next()메서드는 rs에서 참조하는 테이블에서
					                // 튜플을 순차적으로 하나씩 접근하는 메서드
					ideaDTO iTemp = new ideaDTO();
					iTemp.setint(rs.getInt("id"));
					iTemp.setName(rs.getString("name"));
					iTemp.setMemo(rs.getString("memo"));
					iTemp.setAuthor(rs.getString("author"));
					ilist.add(iTemp);
				}
			} catch (SQLException e) {e.printStackTrace();}
		}		
		return ilist;
	}	

	public void add(ideaDTO idto) {
		// TODO Auto-generated method stub
		if (conn()) {
			try {
				String sequence = "select seq_id.nextval from dual";
				PreparedStatement psmt = conn.prepareStatement(sequence);
				ResultSet rs = psmt.executeQuery();
				int id = 0;
				if (rs.next()) {
					id = rs.getInt(1);
				}
				String sql = "insert into ideastore values(?, ?, ?, ?)";
				PreparedStatement psmt1 = conn.prepareStatement(sql);
				psmt1.setInt(1, id);
				psmt1.setString(2, idto.getName());
				psmt1.setString(3, idto.getMemo());
				psmt1.setString(4, idto.getAuthor());
				psmt1.executeUpdate();

				int resultInt = psmt.executeUpdate();
				if (resultInt > 0) {
					conn.commit();
					System.out.println("아이디어 등록 완료");
				} else {
					conn.rollback();
					System.out.println("아이디어 등록 실패");
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

	public void update(ideaDTO idto) {
		// TODO Auto-generated method stub
		if (conn()) {
			try {
				String sql = "update ideastore set name=?, memo=? where id=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, idto.getName());
				psmt.setString(2, idto.getMemo());
				psmt.setInt(3, idto.getint());
				psmt.executeUpdate();

				int resultInt = psmt.executeUpdate();
				if (resultInt > 0) {
					conn.commit();
					System.out.println("아이디어 수정 완료");
				} else {
					conn.rollback();
					System.out.println("아이디어 수정 실패");
				}
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

	public void delete(String delId) {
		// TODO Auto-generated method stub
		if (conn()) {
			try {
				String sql = "delete from ideastore where id=?";
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
}
