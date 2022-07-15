import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class KarePencere extends JPanel implements ActionListener, MouseListener, KeyListener {

	private Cember[] cemberler;
	private int cemberMevcut = 0;
	private int elemanSayisi = 0;
	private int cemberMax = 10;
	private int artis = 1;
	
	private Dortgen dortgen;
	private Dortgen[] dortgenArray;

	private Timer timer;
	private JFrame jFrame;
	
	public KarePencere() {
		
		super();
		
		
		addMouseListener(this);
		
		timer = new Timer(40, this);
		timer.start();
		
		cemberler = new Cember[cemberMax];
		
		dortgen = new Dortgen(300, 300, 20, 20);
		
		dortgenArray = new Dortgen[10];
		dortgenArray[0] = new Dortgen(10, 334, 30, 30);
		dortgenArray[1] = new Dortgen(150, 80, 30, 30);
		dortgenArray[2] = new Dortgen(200, 200, 30, 30);
		dortgenArray[3] = new Dortgen(60, 140, 30, 30);
		dortgenArray[4] = new Dortgen(110, 400, 30, 30);

		
		//this.setBackground(Color.BLUE);
		
		jFrame = new JFrame();

		jFrame.addKeyListener(this);
		jFrame.add(this);
		jFrame.setSize(640,480);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		dortgen.ekranCiz(g);
		
		for(int i = 0; i < 5; i++) {
			
			dortgenArray[i].ekranCiz(g);
		}
		
		for(int i = 0; i < elemanSayisi; i++) {
			
			cemberler[i].ekranCiz(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

//		for(int i = 0; i < elemanSayisi; i++) {
//			
//			cemberler[i].genisle(artis);
//		}
	
//		repaint();
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//
//		Cember yeniCember = new Cember(e.getX(), e.getY(), 0);
//		
//		cemberler[cemberMevcut] = yeniCember;
//		cemberMevcut = (cemberMevcut + 1) % cemberMax;
//		
//		if(elemanSayisi < cemberMax) {
//			
//			elemanSayisi++;
//		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
//		timer.start();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
//		timer.stop();
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() == e.VK_UP) {
			
			dortgen.hareketEt(0, -10, dortgenArray, 5);
			System.err.println("up");
		}
		else if(e.getKeyCode() == e.VK_DOWN) {
			
			dortgen.hareketEt(0, +10, dortgenArray, 5);
			System.err.println("down");
		}
		else if(e.getKeyCode() == e.VK_LEFT) {
			
			dortgen.hareketEt(-10, 0, dortgenArray, 5);
			System.err.println("left");
		}
		else if(e.getKeyCode() == e.VK_RIGHT) {
	
			dortgen.hareketEt(+10, 0, dortgenArray, 5);
			System.err.println("right");
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}







}
