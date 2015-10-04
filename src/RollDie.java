/**
 *die-rolling program using arrays instead of switch
 */

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args)
    {
        //random object will produce secure random numbers
        SecureRandom random = new SecureRandom();

        int frequency1 = 0;//count of 1s rolled
        int frequency2 = 0;//count of 2s rolled
        int frecuency3 = 0;//count of 3s rolled
        int frecuency4 = 0;//count of 4s rolled
        int frecuency5 = 0;//count of 5s rolled
        int frecuency6 = 0;//count of 6s rolled

        //tally counts for 6000000 rolls of a die
        for (int roll = 1; roll <= 6000000; roll++){
            int face = 1 + random.nextInt(6);

            //use face value 1-6 to determine which counter to increment
            switch (face)
            {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frecuency3;
                    break;
                case 4:
                    ++frecuency4;
                    break;
                case 5:
                    ++frecuency5;
                    break;
                case 6:
                    ++frecuency6;
                    break;
            }

        }

        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency1, frequency2, frecuency3, frecuency4, frecuency5, frecuency6);

    }

}
