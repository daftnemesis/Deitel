import javax.swing.*;

/**
 * Created by daftnemesis on 9/08/15.
 */
public class DrawSmileyTest {

    public static void main(String[] args) {

        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}
