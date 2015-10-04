import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

/**
 * Created by daftnemesis on 1/10/15.
 */
public class DrawBulleye extends JPanel {
    private SecureRandom random = new SecureRandom();

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        Color color1 = generadorColor();
        Color color2 = generadorColor();

        gr.setColor(color1);
        gr.fillOval(10, 10, 200, 200);

        gr.setColor(color2);
        gr.fillOval(30, 30, 160, 160);

        gr.setColor(color1);
        gr.fillOval(50, 50, 120, 120);

        gr.setColor(color2);
        gr.fillOval(70, 70, 80, 80);

        gr.setColor(color1);
        gr.fillOval(90, 90, 40, 40);

    }


    private Color generadorColor(){
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        return new Color(r,g,b);
    }

}
