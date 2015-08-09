//Program that shows the smallest and the largest of five integers

import java.util.Scanner;

public class Largest_Smallest2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        num4 = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        num5 = input.nextInt();

        int largest;
        int smallest;

        largest = num1;
        if (largest < num2)
            largest = num2;
        if (largest < num3)
            largest = num3;
        if (largest < num4)
            largest = num4;
        if (largest < num5)
            largest = num5;

        smallest = num1;
        if (smallest > num2)
            smallest = num2;
        if (smallest > num3)
            smallest = num3;
        if (smallest > num4)
            smallest = num4;
        if (smallest > num5)
            smallest = num5;

        System.out.printf("\n\nThe largest is %d\nand the smallest is %d", largest, smallest);


    }
}
