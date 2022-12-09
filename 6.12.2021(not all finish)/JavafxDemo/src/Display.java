import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Display extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
//		Group root = new Group();
//		Scene scene = new Scene(root, Color.BLACK);
//		
//		Image icon = new Image("ss.png");
//		
//		stage.getIcons().add(icon);
//		stage.setTitle("Stage Demo Program...");
//		stage.setWidth(420);
//		stage.setHeight(420);
//		stage.setResizable(false);
////		stage.setX(50);
////		stage.setY(50);
//		stage.setFullScreen(true);
//		stage.setFullScreenExitHint("YOU CAN'T ESCAPE but maybe try q");
//		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
//		
//		stage.setScene(scene);
		
		Parent root = FXMLLoader.load(getClass().getResource("Display.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
