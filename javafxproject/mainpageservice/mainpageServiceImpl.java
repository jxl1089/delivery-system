package mainpageservice;

import java.util.List;

import dao.DatabaseService;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
		Stage stage =  new Stage();
		AnchorPane ap = new AnchorPane();
		
		TableView<Boarder> boraderView = new TableView<Boarder>();
		
		TableColumn<Boarder, String> quest_id = new TableColumn<>("quest_id");
		quest_id.setCellValueFactory(new PropertyValueFactory<>("quest_id"));
		TableColumn<Boarder, String> user_id = new TableColumn<>("user_id");
		user_id.setCellValueFactory(new PropertyValueFactory<>("user_id"));
		TableColumn<Boarder, String> user_name = new TableColumn<>("user_name");
		user_name.setCellValueFactory(new PropertyValueFactory<>("user_name"));
		TableColumn<Boarder, String> quest_detail = new TableColumn<>("quest_detail");
		quest_detail.setCellValueFactory(new PropertyValueFactory<>("quest_detail"));
		TableColumn<Boarder, Integer> quest_price = new TableColumn<>("quest_price");
		quest_price.setCellValueFactory(new PropertyValueFactory<>("quest_price"));
		
		
		boraderView.getColumns().addAll(quest_id, user_id,user_name,quest_detail,quest_price);
		List<Boarder> boarderList = ds.selectAll1();
		ObservableList<Boarder> data = 
				FXCollections.observableArrayList(boarderList);
		boraderView.setItems(data);
		ap.getChildren().add(boraderView);
		stage.setScene(new Scene(ap, 400, 200));
		stage.setTitle("게시글정보");
		stage.show();
	}
	
	
	

}