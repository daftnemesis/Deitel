import javax.swing.*;

public class GUI_PracticesTest extends JFrame {

    public static void main(String[] args) {


        GUI_Practices panel = new GUI_Practices();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }

}
