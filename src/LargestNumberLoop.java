import java.util.Scanner;

/**
 * Created by daftnemesis on 12/08/15.
 */
public class LargestNumberLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int counter = 0;
        int currentNum;
        int largestNum = 0;
        int secLargestNum = 0;

        while (counter < 4) {
            System.out.print("Enter a number: ");
            currentNum = input.nextInt();
            if (currentNum > largestNum) {
                secLargestNum = largestNum;
                largestNum = currentNum;
            }
            if (currentNum < largestNum && currentNum > secLargestNum) {
                secLargestNum = currentNum;
            }

            counter++;
        }
        System.out.printf("Largest: %d\n", largestNum);
        System.out.printf("Second largest: %d\n", secLargestNum);
    }
}
