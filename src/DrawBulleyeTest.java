import javax.swing.*;
import java.awt.*;

/**
 * Created by daftnemesis on 1/10/15.
 */
public class DrawBulleyeTest {


    public static void main(String[] args) {

        DrawBulleye panel = new DrawBulleye();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setVisible(true);

    }
}