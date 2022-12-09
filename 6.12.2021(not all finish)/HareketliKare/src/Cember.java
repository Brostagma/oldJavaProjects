import java.awt.Graphics;

public class Cember {

	private int x, y;
	private int boyut;
	
	
	
	public Cember(int x, int y, int boyut) {

		this.x = x;
		this.y = y;
		this.boyut = boyut;
	}



	public void ekranCiz(Graphics g) {
		
		g.fillOval (x, y, boyut, boyut);
	}
	
	public void genisle(int artis) {
		
		x = x - (artis / 2);
		y = y - (artis / 2);
		
		boyut += artis;
	}
}
