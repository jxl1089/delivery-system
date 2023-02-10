package memberservice;

import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
				

				String txtFldName[] = {"#txtName", "#txtId", "#txtPw", "#txtPwOk"};
				String columnName[] = {"이름","아이디","암호","암호확인"};
				TextField txtFld[] = new TextField[2];
				PasswordField pwFld[] = new PasswordField[2];

				Member m = new Member();
				
				for(int i=0;i<txtFldName.length;i++) {
					if(i < 2) {
						txtFld[i] = (TextField) membership.lookup(txtFldName[i]);
						if(txtFld[i].getText().isEmpty()) {
							
							cs.errorMsg("입력 에러", "비어 있는 컬럼", columnName[i] + " 필드가 비어 있습니다.");
							txtFld[i].requestFocus();
							return;
						}
					} else if(i<4) {
						pwFld[i-2] = (PasswordField) membership.lookup(txtFldName[i]);
						if(pwFld[i-2].getText().isEmpty()) {
							cs.errorMsg("입력 에러", "비어 있는 컬럼", columnName[i] + " 필드가 비어 있습니다.");
							pwFld[i-2].requestFocus();
							return;
						}
					}
				}
				
				
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
					
					rdoMan.setSelected(true);
					return;
				} else if(rdoMan.isSelected()) {
					m.setGender("남자");
				} else if(rdoWoman.isSelected()) {
					m.setGender("여자");
				}
				
	}
}
