import javax.swing.*;
import java.awt.*;

/**
 * Created by daftnemesis on 27/08/15.
 */
public class ConcentricCircles extends JPanel {



    public void paintComponent(Graphics g){
        super.paintComponent(g);


        for (int i = 1; i <= 12; i++){
            g.drawOval(getWidth() / 2 - 10 * i, getHeight() / 2 - 10 * i,
                    20 * i, 20 * i);
        }


    }
}
