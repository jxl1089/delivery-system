package memberservice;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService {


	@Override
	public void errorMsg(String subject, String head, String content) {
		// TODO Auto-generated method stub
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(subject);
		alert.setHeaderText(head);
		alert.setContentText(content);
		alert.showAndWait();

	}



	@Override
	public void windowClose(ActionEvent event) {
		// TODO Auto-generated method stub
		Parent p = (Parent) event.getSource();
		// Parent 에서 Stage 가져오기
		Stage s = (Stage) p.getScene().getWindow();
		// Stage 닫기
		s.close();
	}

}
