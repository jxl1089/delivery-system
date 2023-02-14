package dao;

import memberservice.LoginService;
import memberservice.LoginServiceImpl;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
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
		System.out.println(root);
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
		
		
		
	}
