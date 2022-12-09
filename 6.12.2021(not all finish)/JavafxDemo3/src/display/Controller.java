package display;

import java.io.IOException;

import account.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
    private Pane leftMenuPane;

    @FXML
    private Button btnAccount;

    @FXML
    private Button btnGallery;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnExit;
    
    @FXML
    private Pane rightMenuPane;
    
    Stage stage;
    Parent root;
    Scene scene;
    Pane pane;
    
    String css = this.getClass().getResource("Display.css").toExternalForm();
    boolean check = false;
    
    Account account; 

    public void switchAccount(ActionEvent event) throws IOException {
    	clear();
        account = new Account();
        pane = new Pane();
        pane.getChildren().add(account.getParent());
        rightMenuPane.getChildren().add(pane);
    }
    
    public void clear() {
    	if(!rightMenuPane.getChildren().isEmpty()) {
    		System.out.println("Cleaned...");
    		rightMenuPane.getChildren().remove(pane);
    	}
    	else {
    		System.out.println("Clean");
    	}
    }
    
    public void move(MouseEvent event) {
    	System.out.println("Test");
    }
	
	public void closeStage(ActionEvent event) {
		
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.close();
	}
}





















