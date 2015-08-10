import javax.swing.JFrame;

/**
 * Created by daftnemesis on 9/08/15.
 */
public class DrawPanelTest {

    public static void main(String[] args) {

        DrawPanel panel = new DrawPanel();

        JFrame aplication = new JFrame();

        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplication.add(panel);
        aplication.setSize(250, 250);
        aplication.setVisible(true);
    }
}
