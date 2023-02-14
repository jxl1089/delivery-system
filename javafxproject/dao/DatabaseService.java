package dao;

import java.util.List;

import board.Boarder;
import member.Member;

public interface DatabaseService { 

	public boolean insert(Member m);
	public boolean chkId(String id);
	public boolean loginChk(String id, String pw);
	public List<Member> selectAll();

	
	public boolean write(Boarder b);
	


	public boolean q_insert(Boarder b);

	
	}
	


