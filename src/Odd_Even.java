//Program that displays if a number is odd or even

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a integer and i tell you if is odd or even: ");
        number = input.nextInt();

        if (number % 2 == 0)
            System.out.printf("%d is even", number);
        else
            System.out.printf("%d is odd", number);
    }
}
