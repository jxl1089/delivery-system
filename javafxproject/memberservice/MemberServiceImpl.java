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
import javafx.stage.Stage;
import member.Member;

public class MemberServiceImpl implements MemberService{
	CommonService cs;
	DatabaseService ds;
	
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
		cs = new CommonServiceImpl();
		ds = new DataServiceImpl();
	}

	@Override
	public void joinMember(Parent membership) {
		// TODO Auto-generated method stub
		// 이름 : txtName, 아이디 : txtId, 암호 : txtPw, 암호확인 : txtPwOk
		// 입력 된 값을 출력해보세요

		String txtFldName[] = {"#txtName", "#txtId","txtEmail", "#txtPw", "#txtPwOk" };
		String columnName[] = {"이름","아이디","이메일","암호","암호확인"};
		TextField txtFld[] = new TextField[3];
		PasswordField pwFld[] = new PasswordField[2];

		Member m = new Member();
		
		for(int i=0;i<txtFldName.length;i++) {
			if(i < 3) {
				txtFld[i] = (TextField) membership.lookup(txtFldName[i]);
				if(txtFld[i].getText().isEmpty()) {
					// 에러 표시 - alert 로 실행
					// CommonService 에 errorMsg("제목", "헤드", "콘텐츠");
					// "입력에러", "비어 있는 컬럼", 컬럼명 + "필드가 비어있습니다.");
					cs.errorMsg("입력 에러", "비어 있는 컬럼", columnName[i] + " 필드가 비어 있습니다.");
					txtFld[i].requestFocus();
					return;
				}
			} else if(i<5) {
				pwFld[i-2] = (PasswordField) membership.lookup(txtFldName[i]);
				if(pwFld[i-2].getText().isEmpty()) {
					cs.errorMsg("입력 에러", "비어 있는 컬럼", columnName[i] + " 필드가 비어 있습니다.");
					pwFld[i-2].requestFocus();
					return;
				}
			}
		}
		
		// 암호 와 암호 확인의 값이 같은 때는 암호가 일치한다는 Alert 메시지 출력
		// 같지 않을 때는 암호가 일치하지 않는다는 Alert 메시지 출력		
		if(pwFld[0].getText().equals(pwFld[1].getText())) {
			cs.errorMsg("암호", "암호일치여부", "암호가 일치합니다.");
			m.setName(txtFld[0].getText());
			m.setId(txtFld[1].getText());
			m.setPw(pwFld[0].getText());
		} else {
			cs.errorMsg("암호", "암호일치여부", "암호가 틀립니다.");
			pwFld[0].clear();
			pwFld[1].clear();
			pwFld[0].requestFocus();
			return;
		}

		RadioButton rdoMan = (RadioButton) membership.lookup("#rdoMan");
		RadioButton rdoWoman = (RadioButton) membership.lookup("#rdoWoman");
		
		if(!rdoMan.isSelected() && !rdoWoman.isSelected()) {
			cs.errorMsg("성별", "성별 선택", "성별이 선택되지 않았습니다.");
			// setSelected(true) : 미리 체크 해 주기
			rdoMan.setSelected(true);
			return;
		} 
		
		
		if(ds.insert(m)) {
			Stage s = (Stage) membership.getScene().getWindow();
			s.close();
		} else {
			txtFld[0].clear();
			txtFld[1].clear();
			pwFld[0].clear();
			pwFld[1].clear();
			txtFld[0].requestFocus();
		}
	}	
}