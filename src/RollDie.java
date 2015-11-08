/**
 *die-rolling program using arrays instead of switch
 */

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args)
    {
        //random object will produce secure random numbers
        SecureRandom random = new SecureRandom();

        int[] frequency = new int[7];

        for (int roll = 1; roll <= 6000000; roll++){
            ++frequency[1 + random.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for (int face = 1; face < frequency.length; face++){
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }

}
