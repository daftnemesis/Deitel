//Program that prints the diameter, circumference and area of a circle

import java.util.Scanner;


public class Circle_math {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int radius;

        System.out.println("Enter the radius of the circle: ");
        radius = input.nextInt();

        System.out.printf("The diameter is %d\nThe circumference is %f\nThe area is %f",
                2 * radius, 2 * Math.PI * radius, Math.PI * (radius * radius));


    }
}
