/**
 * Created by daftnemesis on 05/07/2015.
 */
//Exercise 2.5 chapter 2
//A program that will calculate the product of three numbers given by the user

import java.util.Scanner;

public class Product {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Enter the first integer: ");
        x = input.nextInt();

        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d", result);

    }

}
