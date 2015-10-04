import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximun(number1, number2, number3);

        System.out.println("Maximum is: " + result);
    }

    public static double maximun(double x, double y, double z)
    {
        double maximunValue = x;

        if (y > maximunValue) {
            maximunValue = y;
        }
        if (z > maximunValue) {
            maximunValue = z;
        }
        return maximunValue;
    }
}
