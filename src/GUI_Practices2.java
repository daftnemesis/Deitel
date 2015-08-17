import javax.swing.*;
import java.awt.*;

/**
 * Created by daftnemesis on 10/08/15.
 */
public class GUI_Practices2 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);


        int width = getWidth();
        int height = getHeight();


        int count = 0;

        while(count < 15)
        {
            g.drawLine(0, height/15*count, width/15*(count+1), height);
            count++;
        }

        count = 0;
        while(count < 15)
        {
            g.drawLine(width, height/15*count, width-(width/15*(count+1)),
                    height);
            count++;
        }

        count = 0;
        while(count < 15)
        {
            g.drawLine(0, height-(height/15*count), width/15*(count+1),
                    0);
            count++;
        }

        count = 0;
        while(count < 15)
        {
            g.drawLine(width, height-(height/15*count),
                    width-(width/15*(count+1)), 0);
            count++;
        }
    }
}
