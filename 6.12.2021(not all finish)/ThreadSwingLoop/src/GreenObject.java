import java.awt.Color;
import java.awt.Graphics;

public class GreenObject extends Object {

	public static boolean isMove = true;
	private boolean isOpen = false;
	
	@Override
	public void createRectangle(String ID, int width, int height, int x, int y, Graphics g) {
		// TODO Auto-generated method stub
		if(!isObject) {
			propertiesLoad(ID, width, height, x, y);
		}
		g.setColor(Color.green);
		g.fillRect(this.x, this.y, this.width, this.height);
	}

	@Override
	public void moveObject() {
		// TODO Auto-generated method stub
		checkColl(4);
	}
	
	public void thread() {
		if(isOpen == false) {
			Thread gThread = new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					isOpen = true;
					while(true) {
						try {
							Thread.sleep(16,6);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						moveObject();
						if(isMove == false) {
							isOpen = false;
							break;
						}
					}
				}
			});
			if(isMove == true) {
				gThread.start();
			}
		}
	}
}
