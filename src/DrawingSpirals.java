import javax.swing.*;
import javax.xml.bind.JAXBPermission;
import java.awt.*;

/**
 * Created by daftnemesis on 18/10/15.
 */
public class DrawingSpirals extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int length = 20;


        for (int j = 0; j < 10; j++) {
            g.drawLine(centerX + (j * length), centerY - (j * length),
                    centerX + (j * length), centerY + (length * (j + 1)));
            g.drawLine(centerX + (j * length), centerY + (length * (j + 1)),
                    centerX - (length * (j + 1)), centerY + (length * (j + 1)));

            g.drawLine(centerX - (length * (j + 1)), centerY + (length * (j + 1)),
                    centerX - (length * (j + 1)), centerY - (length * (j + 1)));
            g.drawLine(centerX - (length * (j + 1)), centerY - (length * (j + 1)),
                    centerX + (length * (j + 1)), centerY - (length * (j + 1)));
        }

    }
}
