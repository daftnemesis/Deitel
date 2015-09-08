import javax.swing.*;

/**
 * Created by daftnemesis on 27/08/15.
 */
public class ConcentricCirclesTest extends JFrame {

    public static void main(String[] args) {

        ConcentricCircles panel = new ConcentricCircles();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);

    }
}
