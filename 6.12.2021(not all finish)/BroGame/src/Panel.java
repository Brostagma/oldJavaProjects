import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    private static final int screenWidth = 600;
    private static final int screenHeight = 600;
    private static final int uniteSize = 25;
    private static final int playerSize = 20;
    private static final int delay = 60;
    Timer timer;
    private int fps = 0;
    private int playerX = 0;
    private int playerY = 0;

    public Panel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.blue);
        this.setFocusable(true);
        this.addKeyListener(new KeyMap());
    }

    public void startGame() {

        createPlayer();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(playerX, playerY, playerSize, playerSize);
    }

    public void createPlayer() {

        playerX = uniteSize;
        playerY = uniteSize;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
