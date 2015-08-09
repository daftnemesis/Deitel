/**
 * Created by daftnemesis on 25/07/2015.
 */
//Program that takes two numbers from the user and shows the larger
import java.util.Scanner;


public class ComparingIntegers {

    public static void main(String[] args) {

        //create a scanner to obtain input from the user
        Scanner input = new Scanner(System.in);

        int num1; //first number to compare
        int num2; //second number to compare

        System.out.println("Enter a integer: ");
        num1 = input.nextInt();

        System.out.println("Enter a second integer: ");
        num2 = input.nextInt();



        if (num1 > num2){
            System.out.printf("%d is larger\n", num1);
        }else if (num1 < num2){
            System.out.printf("%d is larger\n", num2);
        }else{
            System.out.println("These numbers are equal");
        }
    }

}
