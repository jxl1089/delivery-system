package mainpageservice;


import java.util.List;

import board.Boarder;
import dao.Controller;
import dao.DataServiceImpl;
import dao.DatabaseService;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import member.Member;

public class mainpageServiceImpl implements mainpageService{
	
	DatabaseService ds;
	
	public mainpageServiceImpl() {
		ds = new DataServiceImpl();
	}
	@SuppressWarnings("unchecked")
	public void boarderinfo(Parent root) {	
		
		TableView<Boarder> tableview = (TableView<Boarder>) root.lookup("#tableView");

		TableColumn<Boarder, String> quest_id = new TableColumn<>("고유번호");
		quest_id.setCellValueFactory(new PropertyValueFactory<>("quest_id"));
		TableColumn<Boarder, String> user_id = new TableColumn<>("사용자");
		user_id.setCellValueFactory(new PropertyValueFactory<>("user_id"));
		TableColumn<Boarder, String> quest_detail = new TableColumn<>("상세내용");
		quest_detail.setCellValueFactory(new PropertyValueFactory<>("quest_detail"));
		TableColumn<Boarder, Integer> quest_price = new TableColumn<>("가격");
		quest_price.setCellValueFactory(new PropertyValueFactory<>("quest_price"));
		
		
		quest_id.setPrefWidth(100);
		user_id.setPrefWidth(100);
		quest_detail.setPrefWidth(110);
		quest_price.setPrefWidth(150);
		
		tableview.getColumns().addAll(quest_id, user_id, quest_detail, quest_price);
		
		List<Boarder> boarderList = ds.selectAll();
		
		ObservableList<Boarder> data = 
				FXCollections.observableArrayList(boarderList);
		tableview.setItems(data);
	
		
		
	}

	@Override
	public void wirteProc(Parent root) {
		// TODO Auto-generated method stub
		Stage membershipForm = new Stage();

		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../pageView/writepage.fxml"));

		Parent boarder = null;
		try {
			boarder = loader.load();
			membershipForm.setScene(new Scene(boarder));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Controller ctrl = loader.getController();
		ctrl.setMember(boarder);
		
		membershipForm.setTitle("글쓰기");
		membershipForm.show();
	}
	@Override
	public void mypage(Parent root) {
		// TODO Auto-generated method stub
		Stage membershipForm = new Stage();

		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../pageView/MyPage.fxml"));

		Parent boarder = null;
		try {
			boarder = loader.load();
			membershipForm.setScene(new Scene(boarder));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Controller ctrl = loader.getController();
		ctrl.setMember(boarder);
		
		membershipForm.setTitle("마이페이지");
		membershipForm.show();
		
	}
	@Override
	public void refresh(Parent root) {
		// TODO Auto-generated method stub
		List<Boarder> boarderList = ds.selectAll();
		boarderinfo(root);
		
	}
	
	
	

	

}