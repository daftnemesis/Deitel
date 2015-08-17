import java.util.Scanner;

/**
 * Created by daftnemesis on 12/08/15.
 */
public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;
        int counter = 1;

        int totalMiles = 0;
        int totalGallons = 0;

        while (counter != 0){
            System.out.print("Enter the miles driven in this trip: ");
            miles = input.nextInt();
            totalMiles += miles;

            System.out.print("Enter the gallons used in this trip: ");
            gallons = input.nextInt();
            totalGallons += gallons;

            System.out.printf("The efficiency for this trip was %.2f miles per gallon\n" +
                            "Enter 1 to continue, 0 to exit  ",
                    (double)miles / gallons);
            counter = input.nextInt();


        }

        System.out.printf("\n\nThe total efficiency for all trips made was %.2f miles per gallon",
                (double)totalMiles / totalGallons);




    }

}
