import java.util.Scanner;

/**
 * Created by daftnemesis on 16/08/15.
 */
public class DecimalEquivalent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1101101010;

        int multiplier = 1;
        int result = 0;


        while (number > 0){
            int lastDigit = number % 10;
            result = (lastDigit * multiplier) + result;
            number = number / 10;
            multiplier *= 2;

        }

        System.out.printf("%d", result);



    }
}
