package mainpageservice;

import java.util.List;

import board.Boarder;
import dao.Controller;
import dao.DatabaseService;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import member.Member;

public class mainpageServiceImpl implements mainpageService{
	DatabaseService ds;

	@Override
	public void boarderinfo() {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		
		AnchorPane ap = new AnchorPane();
		
		TableView<Boarder> tableView = new TableView<Boarder>();
		
		TableColumn<Boarder, String> quest_id = new TableColumn<>("#quest_id");
		quest_id.setCellValueFactory(new PropertyValueFactory<>("#quest_id"));
		TableColumn<Boarder, String> user_id = new TableColumn<>("#user_id");
		user_id.setCellValueFactory(new PropertyValueFactory<>("#user_id"));
		TableColumn<Boarder, String> quest_detail = new TableColumn<>("#quest_detail");
		quest_detail.setCellValueFactory(new PropertyValueFactory<>("#quest_detail"));
		TableColumn<Boarder, String> quest_price = new TableColumn<>("#quest_price");
		quest_price.setCellValueFactory(new PropertyValueFactory<>("#quest_price"));
		
		tableView.getColumns().addAll(quest_id, user_id,quest_detail,quest_price);
		
		List<Boarder> boarderList = ds.selectAll();
		ObservableList<Boarder> data = 
				FXCollections.observableArrayList(boarderList);
		tableView.setItems(data);
		
		ap.getChildren().add(tableView);
		stage.setScene(new Scene(ap, 400, 200));
		stage.setTitle("메인페이지 게시물 정보");
		stage.show();
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

	

}