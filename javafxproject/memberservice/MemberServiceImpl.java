package memberservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import member.Member;

public class MemberServiceImpl implements MemberService{

	CommonService cs;
	DatabaseService ds;
	
	@FXML
	private TextField txtid;
	@FXML
	private TextField txtname;
	@FXML
	private PasswordField txtpass;
	@FXML
	private PasswordField txtpassConfirm;
	@FXML
	private TextField txtage;
	@FXML
	private TextField txtemail;
	@FXML
	private TextField txtnum;
	@FXML
	private RadioButton txtgender;
	
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
		cs = new CommonServiceImpl();
		ds = new DataServiceImpl();
	}
	
	@Override
	public void joinMember(Parent membership){
		// TODO Auto-generated method stub
				String id = txtid.getText().trim();		
				String name = txtname.getText().trim();
				String pass = txtpass.getText().trim();
				String confirm = txtpassConfirm.getText().trim();
				String age = txtage.getText().trim();
				String email = txtemail.getText().trim();
				String gender = txtgender.getText().trim();
				
				if(id.isEmpty() || name.isEmpty() || name.isEmpty() || pass.isEmpty() || age.isEmpty() || email.isEmpty()) {
					System.out.println("비어있음, 필수 입력창이 비어있습니다.");
					return;
				}
					if(!pass.equals(confirm)) {
						System.out.println("비밀번호가 일치하지 않습니다.");
						return;
					}
					
				}
	}

