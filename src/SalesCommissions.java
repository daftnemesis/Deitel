import java.util.Scanner;

/**
 * Created by daftnemesis on 19/10/15.
 */
public class SalesCommissions {

    private static int[] salaryRange = new int[10];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        salesRangeCalc(salesCalc(5000));
        for (int value : salaryRange)
            System.out.println(value);


    }

    private static int salesCalc(int weekSales){

        return 200 + (int)(weekSales * 0.09);

    }

    private static void salesRangeCalc(int amount){
        ++salaryRange[amount / 100];

    }
}
