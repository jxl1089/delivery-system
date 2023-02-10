package memberservice;

import java.util.List;

import dao.Controller;
import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
		
		TextField id = (TextField) root.lookup("#txtId");
		PasswordField pw = (PasswordField) root.lookup("#txtPw");
		
		if(ds.loginChk(id.getText(), pw.getText())) {
			System.out.println("로그인 성공");
			Stage s = (Stage)root.getScene().getWindow();
			s.close();
			memberInfo();
		} else {
			System.out.println("로그인 실패");
		}
	}

	@Override
	public void membershipProc(Parent root) {
		// TODO Auto-generated method stub
		
		
		Stage membershipForm = new Stage();
		
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../../membershipForm.fxml"));
		
		Parent member = null;
		try {
			member = loader.load();
			
			membershipForm.setScene(new Scene(member));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Controller ctrl = loader.getController();
		ctrl.setMember(member);
		
		ComboBox<String> cmbAge = 
				(ComboBox<String>) member.lookup("#cmbAge");
		
		cmbAge.getItems().addAll("20대 미만", "20대", "30대", 
				"40대", "50대", "60대이상");
		
		membershipForm.setTitle("회원가입창");
		membershipForm.show();
		
	}

	@Override
	public void memberInfo() {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		
		AnchorPane ap = new AnchorPane();
		
		TableView<Member> tableView = new TableView<Member>();
		
		TableColumn<Member, String> id = new TableColumn<>("id");
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		TableColumn<Member, String> pw = new TableColumn<>("pw");
		pw.setCellValueFactory(new PropertyValueFactory<>("pw"));
		TableColumn<Member, String> name = new TableColumn<>("name");
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumn<Member, String> gender = new TableColumn<>("gender");
		gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
		TableColumn<Member, String> age = new TableColumn<>("age");
		age.setCellValueFactory(new PropertyValueFactory<>("age"));
		TableColumn<Member, String> phoneNum = new TableColumn<>("phoneNum");
		phoneNum.setCellValueFactory(new PropertyValueFactory<>("phoneNum"));
		
		tableView.getColumns().addAll(id, pw,name,gender,age,phoneNum);
		
		List<Member> memberList = ds.selectAll();
		ObservableList<Member> data = 
				FXCollections.observableArrayList(memberList);
		tableView.setItems(data);
		
		ap.getChildren().add(tableView);
		stage.setScene(new Scene(ap, 400, 200));
		stage.setTitle("회원정보");
		stage.show();
	}

}