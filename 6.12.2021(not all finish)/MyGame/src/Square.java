import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Square extends GameObject {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		position = new Position(position.getX() + 10, position.getY());
		
	}

	@Override
	public Image getSprite() {
		// TODO Auto-generated method stub
		
		BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics = image.createGraphics();
		
		graphics.setColor(Color.BLUE);
		graphics.fillRect(0, 0, size.getWidth(), size.getHeight());
		return image;
	}

}
