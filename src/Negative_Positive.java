import java.util.Scanner;

//Program that take five numbers from the user and shows how many zeros, positive and negative number are
public class Negative_Positive {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.println("Enter a number: ");
        num1 = input.nextInt();

        System.out.println("Enter another number: ");
        num2 = input.nextInt();

        System.out.println("Enter another number: ");
        num3 = input.nextInt();

        System.out.println("Enter another number: ");
        num4 = input.nextInt();

        System.out.println("Enter a last number: ");
        num5 = input.nextInt();

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        if (num1 >= 0)
            countPositive++;
        if (num1 < 0)
            countNegative++;
        if (num1 == 0)
            countZero++;

        if (num2 >= 0)
            countPositive++;
        if (num2 < 0)
            countNegative++;
        if (num2 == 0)
            countZero++;

        if (num3 >= 0)
            countPositive++;
        if (num3 < 0)
            countNegative++;
        if (num3 == 0)
            countZero++;

        if (num4 >= 0)
            countPositive++;
        if (num4 < 0)
            countNegative++;
        if (num4 == 0)
            countZero++;

        if (num5 >= 0)
            countPositive++;
        if (num5 < 0)
            countNegative++;
        if (num5 == 0)
            countZero++;


        System.out.printf("Number of negative numbers: %d\n", countNegative);
        System.out.printf("Number of positive numbers: %d\n", countPositive);
        System.out.printf("Number of zeros: %d\n", countZero);
    }
}
