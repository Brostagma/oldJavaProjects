package account;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Account {

	@FXML
	private ImageView avatarImage;
	@FXML
	private Label userName;
	@FXML
	private Label infoLabel;
	@FXML
	private Button editButton;
	
	Parent root;
	
	public void clickEditButton(ActionEvent event) {
		infoLabel.setText("Chill my man!!");
		System.out.println("Good...");
	}
	
	public Parent getParent() throws IOException {
		root = FXMLLoader.load(getClass().getResource("Account.fxml"));
		return root;
	}
	
}
