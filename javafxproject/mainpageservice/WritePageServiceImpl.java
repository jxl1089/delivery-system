package mainpageservice;

import board.Boarder;
import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import memberservice.CommonService;
import memberservice.CommonServiceImpl;
import memberservice.LoginServiceImpl;



public class WritePageServiceImpl implements WritePageService{

	CommonService cs;
	public static String id;
	DatabaseService ds;
	LoginServiceImpl ls;
	
	public WritePageServiceImpl() {
		cs = new CommonServiceImpl();
		ds = new DataServiceImpl();
		ls = new LoginServiceImpl();
	}
	
	public static String uid(String id) {
		return id;
	}
	

	public static String longToBase64(long v) {
		final char[] digits = {
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
				'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
				'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 
				'Y', 'Z', '#', '$'
		};
		int shift = 6;
		char[] buf = new char[64];
		int charPos = 64;
		int radix = 1 << shift;
		long mask = radix - 1;
		long number = v;
		do {
			buf[--charPos] = digits[(int) (number & mask)];
			number >>>= shift;
		} while (number != 0);
		return new String(buf, charPos, (64 - charPos));
		
		
	}

	@Override
	public void writeQuest(Parent root) {
		// TODO Auto-generated method stub
		
		//로그인한 정보 가져와서 setUser_id에 삽입
		System.out.println(root);
		TextField details = (TextField)root.lookup("#q_detail");
		TextField price = (TextField)root.lookup("#q_price");
		String price2 = price.getText();
		int price3 = Integer.parseInt(price2);
		
		String qid = null;
		
		for(int i=0; i<1000; i++) {
		    long time =  System.nanoTime();
		    qid = longToBase64(time);
		    
		}
		
		String uid2 = uid(id);
		
		Boarder b = new Boarder();
		b.setQuest_id(qid);
		b.setUser_id(uid2);
		b.setQuest_detail(details.getText());
		b.setQuest_price(price3);
		
		if(ds.q_insert(b)) {
			Stage s = (Stage) root.getScene().getWindow();
			s.close();
		}
		
	}

}