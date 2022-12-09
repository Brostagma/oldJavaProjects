import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Display extends Canvas {

	private static final long serialVersionUID = 1L;
	private static int WIDTH = 640;
	private static int HEIGHT = 480;
	private final String TITLE = "Thread Example";
	private JFrame frame= new JFrame();
	
	private static GreenObject gObject = new GreenObject();
	private static RedObject rObject = new RedObject();
	
//	Display() {
//		initUI();
//	}

	public void initUI() {
		// TODO Auto-generated method stub
		setSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.gray);
		setFocusable(true);
		addKeyListener(new ControlKey());
		
		frame.setTitle(TITLE);
		frame.add(this);
		frame.pack();
		frame.setMinimumSize(new Dimension(480, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		loop();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		gObject.createRectangle("Green1", 50, 50, 100, HEIGHT / 4, this.getGraphics());
		rObject.createRectangle("Red1", 80, 80, 200, HEIGHT / 2, this.getGraphics());
		g.setFont(new Font("Arial Black", 2, ((WIDTH / 2) + (HEIGHT / 2)) / 32));
		g.drawString("Press 'W' or 'E' : Green -->'W' : Red --> 'E' :", 0, HEIGHT / 12);
	}
	
	public static void objectThread() {
		gObject.thread();
		rObject.thread();
	}
	
	public void loop() {
		repaint();
		objectThread();
		while(true) {
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
			if(WIDTH != frame.getWidth() || HEIGHT != frame.getHeight()) {
				WIDTH = frame.getWidth();
				HEIGHT = frame.getHeight() - (frame.getHeight() - frame.getContentPane().getHeight());
				setSize(new Dimension(WIDTH, HEIGHT));
				gObject.y = HEIGHT / 4;
				rObject.y = HEIGHT / 2;
			}
		}
	}

	public static int getWIDTH() {
		return WIDTH;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}
}
