//Inputting and outputting floating-point numbers with Account objects

import java.util.Scanner;

public class AccountTests {

    public static void main(String[] args){

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //Displays initial balance of each object
        displayAccount(account1);
        displayAccount(account2);

        //Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);

        //Displays balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("Withdrawing %.2f from account1\n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);

    }

    public static void displayAccount(Account account){
        System.out.printf("%s balance: $%.2f%n",
                account.getName(), account.getBalance());
    }

}
