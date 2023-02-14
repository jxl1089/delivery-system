package mainpageservice;

import board.Boarder;
import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
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
		
		TextField details = (TextField)root.lookup("#q_detail");
		TextField price = (TextField)root.lookup("#q_price");
		String price2 = price.getText();
		int price3 = Integer.parseInt(price2);
		
		
		Boarder b = new Boarder();
		b.setQuest_detail(details.getText());
		b.setQuest_price(price3);
		
	}

}
