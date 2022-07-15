import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlKey implements KeyListener {

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed key...");
		if(e.getKeyCode() == KeyEvent.VK_W) {
			System.out.println("Pressed key 'W'");
			if(GreenObject.isMove == true) {
				GreenObject.isMove = false;
			}
			else if(GreenObject.isMove == false) {
				GreenObject.isMove = true;
			}
			System.out.println("Green isMove " + GreenObject.isMove);
		}
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			System.out.println("Pressed key 'E'");
			if(RedObject.isMove == true) {
				RedObject.isMove = false;
			}
			else if(RedObject.isMove == false) {
				RedObject.isMove = true;
			}
			System.out.println("Red isMove " + RedObject.isMove);
		}
		Display.objectThread();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
