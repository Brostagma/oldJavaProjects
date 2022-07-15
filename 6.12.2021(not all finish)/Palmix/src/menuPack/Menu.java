package menuPack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu extends Application{

	private Scene scene;
	@Override
	public void start(Stage form) throws Exception {
		// TODO Auto-generated method stub
		form.setTitle("Login");
		
		scene = new Scene(new GridPane());
		form.setFullScreen(true);
		form.setScene(scene);
		form.show();
	}
	
	public void goLaunch() {
		try {
			start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
