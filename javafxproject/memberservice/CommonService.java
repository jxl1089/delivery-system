package memberservice;

import javafx.event.ActionEvent;

public interface CommonService{

	void errorMsg(String subject, String head, String content);
	void windowClose(ActionEvent event);

}
