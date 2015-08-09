//Program that separates a 5 digit number into its individual digits

import java.util.Scanner;

public class Separating_Digits {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;
        int aux;
        int v, w, x, y, z;

        System.out.println("Enter a five digit integer: ");
        number = input.nextInt();

        v = number % 10;
        aux = number / 10;
        w = aux % 10;
        aux = aux / 10;
        x = aux % 10;
        aux = aux / 10;
        y = aux % 10;
        aux = aux / 10;
        z = aux % 10;
        aux = aux / 10;

        System.out.println("The number complete is " + number);
        System.out.printf("The number separate is:\n%d %d %d %d %d",z,y,x,w,v);

    }
}
