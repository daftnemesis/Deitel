//Program that uses the Account classes for testing it
//Uses the classes constructor to initialize the name instance
//variable at the time each account object is created

import java.util.Scanner;

public class AccountTests {

    public static void main(String[] args){

        // create two Account objects
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        //display initial value of name ofr each account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

    }
}
