import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

	@FXML
    private Circle myCircle;
	public double x;
	public double y;
	
	public void up(ActionEvent e) {
		myCircle.setCenterY(y-=5);
		
		System.out.println("UP");
	}
	
	public void down(ActionEvent e) {
		myCircle.setCenterY(y+=5);
		System.out.println("DOWN");
	}
	
	public void left(ActionEvent e) {
		myCircle.setCenterX(x-=5);
		System.out.println("LEFT");
	}
	
	public void right(ActionEvent e) {
		myCircle.setCenterX(x+=5);
		System.out.println("RIGHT");
	}
}
