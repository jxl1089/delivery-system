package mainpageservice;

import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.scene.Parent;
import memberservice.CommonService;
import memberservice.CommonServiceImpl;

public class WritePageServiceImpl implements WritePageService{

	CommonService cs;
	DatabaseService ds;
	
	public WritePageServiceImpl() {
		cs = new CommonServiceImpl();
		ds = new DataServiceImpl();
	}
	
	@Override
	public void writeQuest(Parent root) {
		// TODO Auto-generated method stub
		
	}

}
