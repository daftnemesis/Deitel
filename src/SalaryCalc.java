import java.util.Scanner;

/**
 * Created by daftnemesis on 12/08/15.
 */
public class SalaryCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rate;
        int hours;

        System.out.print("Enter the hourly rate for this employee: ");
        rate = input.nextInt();

        System.out.print("Enter the hours worked this week: ");
        hours = input.nextInt();

        double salary1 = salaryCalculator(rate, hours);

        System.out.printf("The salary this week is %.2f", salary1);

    }

    public static double salaryCalculator(int rate, int hours){
        double total = 0;


        if (hours <= 40) {
            total = (double)hours * rate;
        }
        if (hours > 40){
            total = ((hours - 40) * (rate * 1.5)) + (40 * rate);
        }

        return total;
    }
}
