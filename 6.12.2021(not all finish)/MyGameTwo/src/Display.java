import java.awt.Insets;

import javax.swing.JFrame;

public class Display extends JFrame{

	private Insets icKisim;
	
	public Display(int width, int height) {
		
		//GameLoop();
		
		setTitle("MY GAME 2");
		//setSize(width, height);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		icKisim = getInsets();
		
		setSize(icKisim.left + width + icKisim.right, icKisim.top + width + icKisim.bottom);
		
	}
}
