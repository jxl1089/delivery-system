package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import member.Member;

public abstract class JoinServiceImpl implements Delivery{
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;

	
	public JoinServiceImpl() {
		// TODO Auto-generated constructor stub

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "oracle";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("오라클 연결 성공");
		} catch(Exception e) {
			System.out.println("오라클 연결 실패");
			e.printStackTrace();
		}
	}
	@Override
	public boolean insert(Member m) {
		
		// TODO Auto-generated method stub
		if (m.getId() != null) {
			String sql = "insert into member values(?,?,?,?,?,?)";
			
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "이름");
				pstmt.setString(2, "아이디");
				pstmt.setString(3, "아이디확인");
				pstmt.setString(4, "비밀번호");
				pstmt.setString(5, "성별");
				pstmt.setString(6, "나이");
				pstmt.setString(7,"이메일");
				
				
				int result = pstmt.executeUpdate();
				
					return true;
				
				
			
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
		return false;
	}

}
