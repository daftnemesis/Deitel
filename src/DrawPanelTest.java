import javax.swing.JFrame;

/**
 * Created by daftnemesis on 9/08/15.
 */
public class DrawPanelTest {

    public static void main(String[] args) {

        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
