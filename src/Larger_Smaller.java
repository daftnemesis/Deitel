//Program that takes three numbers from the user and shows the sum, average, product
//smallest and largest of the numbers

import java.util.Scanner;

public class Larger_Smaller {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variables that store the user input
        int num1;
        int num2;
        int num3;
        int largest;
        int smallest;

        System.out.println("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        num2 = input.nextInt();

        System.out.println("Enter the last integer: ");
        num3 = input.nextInt();

        System.out.printf("The sum is %d\n", num1 + num2 + num3);

        System.out.printf("The average is %d\n", (num1 + num2 + num3) / 3);

        System.out.printf("The product is %d\n", num1 * num2 * num3);

        largest = num1;
        if (largest < num2)
            largest = num2;
        if (largest < num3)
            largest = num3;

        smallest = num1;
        if (smallest > num2)
            smallest = num2;
        if (smallest > num3)
            smallest = num3;

        System.out.printf("The smallest number is %d\n", smallest);
        System.out.printf("The largest number is %d\n", largest);



    }

}
