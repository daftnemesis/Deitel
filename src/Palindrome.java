import java.util.Scanner;

/**
 * Created by daftnemesis on 16/08/15.
 */
public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.println("It's palindrome");
        else
            System.out.println("It's not a palindrome");

    }

    public static boolean isPalindrome(int number){
        int aux = number;
        int count = 0;
        int result = 0;


        while (count < 5){
            int lastDigit = aux % 10;
            result = result * 10 + lastDigit;
            aux = aux / 10;

            count++;
        }

        if (number == result)
            return true;
        else
            return false;
    }


}
