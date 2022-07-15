import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameLoop {

	private Display display;
	private BufferedImage gBuffer;
	private Graphics grp;
	
	public GameLoop(int width, int height) {
		
		display = new Display(width, height);
		
		gBuffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		update();
		render();
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}
	
	private void render() {
		// TODO Auto-generated method stub
		
	}

}
