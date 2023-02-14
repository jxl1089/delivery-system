package dao;

import java.util.List;

import board.Boarder;
import member.Member;

public interface DatabaseService { 

	public boolean insert(Member m);
	public boolean chkId(String id);
	public boolean loginChk(String id, String pw);
	public List<Member> selectAll();
	List<Boarder> selectAll1();
	
	}
	


