import javax.swing.*;

/**
 * Created by daftnemesis on 18/10/15.
 */
public class DrawRainbowTest {

    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400, 250);
        app.setVisible(true);
    }
}
