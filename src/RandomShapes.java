
import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

/**
 * Program that generates 10 random shapes, with random color, random coordinates and random lengths
 */
public class RandomShapes extends JPanel {

    private SecureRandom random = new SecureRandom();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            if (isRect()) {
                g.setColor(generadorColor());
                g.fillRect(genCoor(), genCoor(), genLenght(getWidth() / 2), genLenght(getHeight() / 2));
            } else {
                g.setColor(generadorColor());
                g.fillOval(genCoor(), genCoor(), genLenght(getWidth() / 2), genLenght(getHeight() / 2));
            }
        }
    }

    public boolean isRect(){
        int x = random.nextInt(2);

        if (x == 0)
            return true;
        else
            return false;
    }

    private Color generadorColor(){
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        return new Color(r,g,b);
    }

    private int genCoor(){
        return random.nextInt(150);
    }

    private int genLenght(int x){
        return random.nextInt(x);
    }


}
