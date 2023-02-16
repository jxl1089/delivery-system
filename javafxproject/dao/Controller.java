package dao;

import memberservice.LoginService;
import memberservice.LoginServiceImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import board.Boarder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mainpageservice.WritePageService;
import mainpageservice.WritePageServiceImpl;
import mainpageservice.mainpageService;
import mainpageservice.mainpageServiceImpl;
import memberservice.CommonService;
import memberservice.CommonServiceImpl;
import memberservice.MemberService;
import memberservice.MemberServiceImpl;
import javafx.stage.Stage;


public class Controller {
	private Parent root;
	private LoginService ls;
	private CommonService cs;
	private Parent member;
	private Parent board;
	private MemberService ms;
	private mainpageService mp;
	private WritePageService wp;
	@FXML
    private TableView<Boarder> tableView;
	PreparedStatement pstmt;
	Connection con;
	ResultSet rs;
	public Controller() {
		ls = new LoginServiceImpl();
		cs = new CommonServiceImpl();
		ms = new MemberServiceImpl();
		mp = new mainpageServiceImpl();
		wp = new WritePageServiceImpl();
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
		System.out.println(root);
		ls.membershipProc(root);
	}
	
	public void joinMember() {
		ms.joinMember(member);
	}
	
	public void wirteProc() {
		mp.wirteProc(root);
	}
	public void writeQuest() {
		wp.writeQuest(member);
	}
	public void boarderinfo() {
		
		mp.boarderinfo(member);
	}
	public void mypage() {
		mp.mypage(root);
	}
	public void refresh() {
		System.out.println(member);
		mp.refresh(member);
	}
	
	@FXML
	private Button logout_button;
	@FXML
	private AnchorPane scenePane;
	
	public void logout(ActionEvent event) throws Exception {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("종료");
		alert.setHeaderText("정말 종료 하시겠습니까?");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
		Stage stage = (Stage) scenePane.getScene().getWindow();
		System.out.println("정상적으로 종료 되었습니다.");
		stage.close();
		} 
		}
	
	public boolean remove(ActionEvent event) {
		// TODO Auto-generated method stub
		Boarder b = new Boarder();
		int selectId = tableView.getSelectionModel().getSelectedIndex();
		tableView.getItems().remove(selectId);
		String sql = "delete quest values(?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, b.getQuest_id());
			pstmt.setString(2, b.getUser_id());
			pstmt.setString(3, b.getQuest_detail());
			pstmt.setInt(4, b.getQuest_price());
			
			rs = pstmt.executeQuery();
			rs.next();
			int result = rs.getInt(1);
			
			if(result >=1) {
				return true;
			}
			pstmt.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	 
	
		
		
	}
