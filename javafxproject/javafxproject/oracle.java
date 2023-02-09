package javafxproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class oracle {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (Exception e) {
			System.out.println("드라이버 등록 실패");
		}
		Connection con = null;	
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "system";
			String pwd = "1234";		
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("오라클 연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오라클 연결 실패");
		}
	}
}