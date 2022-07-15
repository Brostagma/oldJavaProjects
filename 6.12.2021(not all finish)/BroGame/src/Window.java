import javax.swing.*;

public class Window extends JFrame {

    public Window() {

        add(new Panel());
        setTitle("BROS GAME");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
