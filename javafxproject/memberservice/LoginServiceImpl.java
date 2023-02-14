package memberservice;

import java.util.List;

import board.Boarder;
import dao.Controller;
import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import member.Member;

public class LoginServiceImpl implements LoginService{
	DatabaseService ds;
	
	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
		ds = new DataServiceImpl();
	}
	
	@Override
	public void loginProc(Parent root) {
		// TODO Auto-generated method stub

		TextField id = (TextField)root.lookup("#txtId");
		String trueid = id.getText();
		PasswordField pw = (PasswordField) root.lookup("#txtPw");
		
		if(ds.loginChk(id.getText(), pw.getText())) {
			System.out.println("로그인 성공");
			Stage s = (Stage)root.getScene().getWindow();
			s.close();
			
			Stage mainP = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../pageView/MainPage.fxml"));
			Parent board = null;
			
			try {
				board = loader.load();
				mainP.setScene(new Scene(board));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			Boarder b = new Boarder();
			b.setUser_id(trueid);
			
			Controller ctrl = loader.getController();
			ctrl.setMember(board);
			
			mainP.setTitle("메인페이지");
			mainP.show();
			
			
		} else {
			System.out.println("로그인 실패");
		}
		boolean result = ds.loginChk(id.getText(), pw.getText());
		
		
		//여기의 id값을 wirtepageservice에 가져가야함
	}

	@Override
	public void membershipProc(Parent root) {
		// TODO Auto-generated method stub
		
		
		Stage membershipForm = new Stage();
		
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../pageView/register.fxml"));
		
		Parent member = null;
		try {
			member = loader.load();
			
			membershipForm.setScene(new Scene(member));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setMember(member);
		
		membershipForm.setTitle("회원가입창");
		membershipForm.show();
		
	}


	@Override
	public void logout() {
		// TODO Auto-generated method stub
		Stage mainP = new Stage();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../pageView/MainPage.fxml"));
		
		Parent member =  null;
		try {
			member = loader.load();
			mainP.setScene(new Scene(member));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}