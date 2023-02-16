package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.Boarder;
import member.Member;


public class DataServiceImpl implements DatabaseService{
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;
	
	public DataServiceImpl() {
		// TODO Auto-generated constructor stub
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,user,pass); //Connection 전역 변수 사용했으니 여기에서는 사용안함
			System.out.println("오라클 연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오라클 연결 실패");
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean insert(Member m) {
		// TODO Auto-generated method stub
		if(chkId(m.getId())) {
			String sql = "insert into member values(?,?,?,?,?,?,?)";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, m.getId());
				pstmt.setString(2, m.getPw());
				pstmt.setString(3, m.getName());
				pstmt.setString(4, m.getEmail());
				pstmt.setInt(5, m.getAge());
				pstmt.setString(6, m.getGender());
				pstmt.setString(7, m.getPhoneNum());
				
				int result = pstmt.executeUpdate();
				
				if(result == 1) {
					System.out.println("회원가입 완료");
					return true;
				}
				pstmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else {
				System.out.println("동일한 아이디가 존재합니다.");
			}
			
		return false;
	}

	@Override
	public boolean chkId(String id) {
		// TODO Auto-generated method stub
		boolean result = false;
		String sql = "select decode(count(*), 1, 'false', 'true')"+" from member where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			result = Boolean.parseBoolean(rs.getString(1));
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}

	

	@Override
	public boolean loginChk(String id, String pw) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from member where id=? and pw=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			rs.next();
			int result = rs.getInt(1);
			

			
			if(result >=1) {
				return true;
			}
			pstmt.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public boolean q_insert(Boarder b) {
		// TODO Auto-generated method stub
		//primarykey값을 어떻게 가져올 것인가
		String sql = "insert into quest values (? , ? , ? , ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, b.getQuest_id());
			pstmt.setString(2, b.getUser_id());
			pstmt.setString(3, b.getQuest_detail());
			pstmt.setInt(4, b.getQuest_price());
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("심부름 등록 완료");
				return true;
			}
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<Boarder> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select quest_id,name,quest_detail,price from member m, quest q where m.id = q.user_id";
		List<Boarder> boarderList = new ArrayList<Boarder>();
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Boarder b = new Boarder();
				b.setQuest_id(rs.getString(1));
				b.setUser_id(rs.getString(2));
				b.setQuest_detail(rs.getString(3));
				b.setQuest_price(rs.getInt(4));	
				boarderList.add(b);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return boarderList;


}
}
