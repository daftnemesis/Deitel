import java.util.Scanner;

public class TargetHeartRateTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String lastName;
        int day;
        int month;
        int year;

        System.out.print("Enter your first name: ");
        name = input.nextLine();

        System.out.print("Enter your last name: ");
        lastName = input.nextLine();

        System.out.print("Enter your date of birth (Month/Day/Year):\n ");
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();

        TargetHeartRate thr = new TargetHeartRate(name, lastName, month, day, year);

        thr.convertAgeInYears(year);


        System.out.printf("Displaying information:\n\nName: %s %s\nBirthday: %d/%d/%d\n\n" +
                "Max Heart Rate: %d\n",thr.getName(), thr.getLastName(), thr.getMonth(),
                thr.getDay(), thr.getYear(), thr.maxHeartRate());
        thr.targetHeartRate();

    }
}
