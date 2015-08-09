//Program that reads two integers from user and determines whether the first is a multiple of the second

import java.util.Scanner;


public class Multiples {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        num2 = input.nextInt();

        if (num1 % num2 == 0)
            System.out.printf("%d is multiple of %d", num1, num2);
        else
            System.out.printf("%d is not multiple if %d", num1, num2);
    }
}
