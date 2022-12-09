 import java.awt.Graphics;
import java.awt.Rectangle;

public class Dortgen {

	
	private Rectangle rectangle;
	
	public Dortgen(int x, int y, int width, int height) {
		
		rectangle = new Rectangle(x, y, width, height);
	}
	
	public void ekranCiz(Graphics g) {
		
		g.drawRect((int)rectangle.getX(), (int)rectangle.getY(), (int)rectangle.getWidth(), (int)rectangle.getHeight());
	}
	
	public void hareketEt(int x, int y, Dortgen[] dortgenArray, int sayi) {
		
		Rectangle carpisma = new Rectangle(rectangle);
		
		carpisma.setLocation((int)carpisma.getX() + x, (int)carpisma.getY());
		
		boolean cakisma = false;
		
		for(int i = 0; i < sayi; i++) {
			
			if(carpisma.intersects(dortgenArray[i].getRectangle())) {
				
				cakisma = true;
			}
		}
		
		if(cakisma == false) {
			
			rectangle.setLocation((int)rectangle.getX() + x, (int)rectangle.getY() + y);
		}
		
		
	}
	
	public Rectangle getRectangle() {
		
		return rectangle;
	}
}
