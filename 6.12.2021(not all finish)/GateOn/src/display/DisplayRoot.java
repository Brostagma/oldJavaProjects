package display;

public abstract class DisplayRoot extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static javax.swing.JPanel ROOT = new javax.swing.JPanel();
	private static String TITLE;
	private static java.awt.Dimension DIMENSION;
	
	public abstract void initUI();
	

	public static javax.swing.JPanel getRoot() {
		return ROOT;
	}

	public static void setRoot(javax.swing.JPanel setROOT) {
		ROOT = setROOT;
	}

	public static String getTITLE() {
		return TITLE;
	}

	public static void setTITLE(String tITLE) {
		TITLE = tITLE;
	}


	public static java.awt.Dimension getDIMENSION() {
		return DIMENSION;
	}


	public static void setDIMENSION(java.awt.Dimension dIMENSION) {
		DIMENSION = dIMENSION;
	}

}
