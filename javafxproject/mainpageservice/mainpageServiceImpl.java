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