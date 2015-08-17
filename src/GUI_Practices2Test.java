import javax.swing.*;

/**
 * Created by daftnemesis on 10/08/15.
 */
public class GUI_Practices2Test extends JFrame {

    public static void main(String[] args) {

        GUI_Practices2 panel = new GUI_Practices2();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);

    }
}
