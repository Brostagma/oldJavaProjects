package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SceneController2 {

	@FXML
	private Label nameLabel;
	
	private Scene scene;
	private Parent root;	
	private Stage stage;
	
	
	public void switchLevel1(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Level1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	public void setnameLabel(String name) {
		nameLabel.setText("Hello " + name);
	}
}
