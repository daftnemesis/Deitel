import javax.swing.*;
import java.awt.*;

/**
 * Created by daftnemesis on 10/08/15.
 */
public class GUI_Practices extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int widht = getWidth();
        int height = getHeight();

        int counter = 0;

        //arriba izq
        while (counter < 15) {

            g.drawLine(0,0,widht - (widht / 15 * counter), height / 15 * counter);
            counter++;
        }

        counter = 0;

        //abajo iz
        while (counter < 15){

            g.drawLine(0,height,widht/ 15 * counter,height / 15 * counter);

            counter++;
        }

        counter = 0;

        //abajo der
        while (counter < 15){

            g.drawLine(widht, height, widht - (widht / 15 * counter), height / 15 * counter);

            counter++;
        }


        counter = 0;

        //arriba der
        while ( counter < 15){

            g.drawLine(widht, 0, widht / 15 * counter, height / 15 * counter);

            counter++;
        }
    }


}
