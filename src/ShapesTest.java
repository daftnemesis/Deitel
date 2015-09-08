import javax.swing.*;

public class ShapesTest {

    public static void main(String [] args){
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n" +
                        "Enter 2 to drae ovals"
        );

        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
