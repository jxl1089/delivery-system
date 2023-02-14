package memberservice;

import javafx.event.ActionEvent;

public interface CommonService{
	
	void cancleEvent(ActionEvent event);
	void errorMsg(String subject, String head, String content);
	

}
