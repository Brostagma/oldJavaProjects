import java.awt.Graphics;

public abstract class Object {

	protected String id;
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected boolean isObject = false;
	protected boolean isColl = true;
	
	public abstract void createRectangle(String ID, int width, int height, int x, int y,Graphics g);
	
	
	public void propertiesLoad(String ID, int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.id = ID;
		isObject = true;
	}
	
	protected void checkColl(int move) {
		if(isColl == true) {
			if((x + width) + move >= Display.getWIDTH()) {
				isColl = false;
			}
			x += move;
		}
		else if(isColl == false) {
			if(x <= 0) {
				isColl = true;
			}
			x -= move;
		}
	}

	public abstract void moveObject();
}
