/**
 * Created by daftnemesis on 05/07/2015.
 */
//Exercise 2.15
//Program that takes two number by the user and shows his sum, product, difference ans quotient

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        System.out.printf("The sum is %d\n", number1 + number2);

        System.out.printf("The product is %d\n", number1 * number2);

        System.out.printf("The difference is %d\n", number1 - number2);

        System.out.printf("The quotient is %d\n", number1 / number2);

    }

}
