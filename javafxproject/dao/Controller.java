package dao;

import memberservice.LoginService;
import memberservice.LoginServiceImpl;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import memberservice.CommonService;
import memberservice.CommonServiceImpl;
import memberservice.MemberService;
import memberservice.MemberServiceImpl;

public class Controller {
	private Parent root;
	private LoginService ls;
	private CommonService cs;
	private Parent member;
	private MemberService ms;
	
	public Controller() {
		ls = new LoginServiceImpl();
		cs = new CommonServiceImpl();
		ms = new MemberServiceImpl();
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	
	public void setMember(Parent member) {
		// TODO Auto-generated method stub
		this.member = member;
	}
	
	public void loginProc() {
		ls.loginProc(root);
	}
	public void cancelProc(ActionEvent event) {
		cs.cancleEvent(event);
	}
	public void membershipProc() {
		ls.membershipProc(root);
	}
	
	public void joinMember() {
		ms.joinMember(member);
	}


}