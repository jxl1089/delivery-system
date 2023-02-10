package LoginMember;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{

	@Override
	public void loginProc(Parent root) {
		// TODO Auto-generated method stub
		TextField id = (TextField) root.lookup("#txtId");
		
	}

}
