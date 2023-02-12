package memberservice;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;

public interface CommonService{

	void errorMsg(String subject, String head, String content);
	void windowClose(ActionEvent event);

}
