import java.util.Scanner;

//Program that calculates the BMI
public class BMI {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int weight;
        int height;
        double bmi;

        System.out.println("Enter your weight in kilograms: ");
        weight = input.nextInt();

        System.out.println("Enter your height in centimeters: ");
        height = input.nextInt();

        bmi = weight / Math.pow(height, 2) * 10000;

        System.out.printf("Your BMI is %.2f\n", bmi);
        System.out.println("BMI values");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

    }
}
