package loginPack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import menuPack.Menu;



public class Login extends Application {

	private int width = 500,height = 500;
	private int controlSpace = 12;
	private GridPane grid ;
	private Scene scene;
	private HBox welcomeBox,enterBox,rememberBox;
	
	private Label welcomeTitle,userName;
	private TextField userText;
	private Button enterButton;
	private CheckBox rememberCheck;
	
	@Override
	public void start(Stage form) throws Exception {
		// TODO Auto-generated method stub
		form.setTitle("Login");
		grid = new GridPane();
		grid.setGridLinesVisible(false);
		grid.setVgap(controlSpace);
		grid.setHgap(controlSpace);
		grid.setAlignment(Pos.CENTER);
		welcomeBox = new HBox();
		welcomeBox.setAlignment(Pos.CENTER);
		welcomeBox.getChildren().add(welcomeTitle());
		enterBox = new HBox();
		enterBox.setPrefHeight(34);
		enterBox.setAlignment(Pos.CENTER);
		enterBox.getChildren().add(enterButton());
		rememberBox = new HBox();
		rememberBox.setAlignment(Pos.CENTER_LEFT);
		rememberBox.getChildren().add(rememberCheck());
		grid.add(welcomeBox, 1, 0);
		grid.add(userText(), 1, 1);
		grid.add(enterBox, 1, 2);
		grid.add(rememberBox, 1, 3);
		scene = new Scene(grid, width, height);
		form.setResizable(false);
		form.setScene(scene);
		scene.getStylesheets().add("loginPack/Login.css");
		form.show();
	}

	public Label welcomeTitle() {
		welcomeTitle = new Label("Welcome!");
		return welcomeTitle;
	}
	
	public Label userName() {
		userName = new Label("User Name:");
		return userName;
	}
	
	public TextField userText() {
		userText = new TextField();
		return userText;
	}
	
	public Button enterButton() {
		enterButton = new Button("sh-3.2# go");
		enterButton.setOnAction(clickButton());
		return enterButton;
	}

	public CheckBox rememberCheck() {
		rememberCheck = new CheckBox("Remember");
		return rememberCheck;
	}
	
	public EventHandler<ActionEvent> clickButton() {
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("work...");
				new Menu().goLaunch();
			}
		};
		return event;	
	}
	

	public void goLaunch() {
		launch();
	}
	
}
