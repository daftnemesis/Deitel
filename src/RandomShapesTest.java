import javax.swing.*;

/**
 * Created by daftnemesis on 1/10/15.
 */
public class RandomShapesTest {

    public static void main(String[] args) {
        RandomShapes panel = new RandomShapes();
        JFrame marco = new JFrame();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.add(panel);
        marco.setSize(250, 250);
        marco.setVisible(true);
    }



}
