import java.security.SecureRandom;

/**
 *Shifted and scaled random integers.
 */
public class RandomIntegers {

    public static void main(String[] args) {

        //random object will produce secure random numbers
        SecureRandom random = new SecureRandom();

        //loop 20 times
        for (int counter = 1; counter <= 20; counter++)
        {
            //pick random integer from 1 to 6
            int face = 1 + random.nextInt(6);

            System.out.printf("%d ", face);

            if (counter % 5 == 0)
                System.out.println();
        }


    }
}
