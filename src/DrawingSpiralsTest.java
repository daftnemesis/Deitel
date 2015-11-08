import javax.swing.*;

/**
 * Created by daftnemesis on 18/10/15.
 */
public class DrawingSpiralsTest {

    public static void main(String[] args) {

        DrawingSpirals panel = new DrawingSpirals();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400, 400);
        app.setVisible(true);
    }
}
