import java.util.Scanner;

/**
 * Created by daftnemesis on 12/08/15.
 */
public class SalesCommissionCalc {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        int item1Count = 0;
        int item2Count = 0;
        int item3Count = 0;
        int item4Count = 0;

        int choice = 1;


        while (choice != 0){

            System.out.print("Enter a item number or 0 to exit:  ");
            choice = input.nextInt();

            if (choice == 1){
                item1Count++;
            }else if (choice == 2){
                item2Count++;
            }else if (choice == 3){
                item3Count++;
            }else if (choice == 4){
                item4Count++;
            }

        }

        double total = (item1 * item1Count) + (item2 * item2Count) + (item3 * item3Count) + (item4 * item4Count);

        System.out.printf("The total earnings for this salespeople is $%.2f\n", 200.00 + (total * 0.09));
    }
}
