package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {

	@FXML
	private TextField nameTextField;
	
	private Scene scene;
	private Parent root;	
	private Stage stage;
	
	
	public void switchLevel2(ActionEvent event) throws IOException {
		String username = nameTextField.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Level2.fxml"));
		root = loader.load();
		SceneController2 sceneController2 = loader.getController();
		sceneController2.setnameLabel(username);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
}
