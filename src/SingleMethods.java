import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Class for make exercises
 */
public class SingleMethods {

//    Write a method integerPower(base, exponent) that returns the value of
//    base exponent
//    For example, integerPower(3, 4) calculates 3 4 (or 3 * 3 * 3 * 3 ). Assume that exponent is a positive,
//    nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
//    Do not use any Math class methods. Incorporate this method into an application that reads
//    integer values for base and exponent and performs the calculation with the integerPower method.
    public static int integerPower(int base, int exp) {
        int res = base;
        for (int i = 1; i < exp; i++){
            res *= base;
        }
        return res;
    }

//    Define a method hypotenuse that calculates the hypotenuse of
//    a right triangle when the lengths of the other two sides are given. The method should take two arguments
//    of type double and return the hypotenuse as a double.

    public static double hypotenuseCalc(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }


//    Write a method isMultiple that determines, for a pair of integers, whether the
//    second integer is a multiple of the first. The method should take two integer arguments and return
//    true if the second is a multiple of the first and false otherwise.

    public static boolean isMultiple(int x, int y){ return x % y == 0; }


//    Write a method isEven that uses the remainder operator ( % ) to determine
//    whether an integer is even. The method should take an integer argument and return true if the integer
//    is even and false otherwise.

    public static boolean isEven(int x){ return x % 2 == 0; }


//    Write a method squareOfAsterisks that displays a solid
//    square (the same number of rows and columns) of asterisks whose side is specified in integer parameter side.
//    For example, if side is 4 , the method should display
//                          ****
//                          ****
//                          ****
//                          ****

    public static void squareForm(int x){

        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


//    Modify the method created in Exercise 6.18 to receive a second parameter of type char called fillCharacter .
//    Form the square using the char provided as an argument.

    public static void squareForm(int x, char fillCharacter){


        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

//    Write an application that prompts the user for the radius of a circle and uses
//    a method called circleArea to calculate the area of the circle.

    public static double circleArea(double radius){ return Math.PI * (radius * radius); }


//    Write methods that accomplish each of the following tasks:
//    a) Calculate the integer part of the quotient when integer a is divided by integer b.
//    b) Calculate the integer remainder when integer a is divided by integer b.
//
//    c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
//    receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
//    each pair of digits by two spaces. For example, the integer 4562 should appear as
//    4  5  6  2
//
//    Incorporate the methods into an application that inputs an integer and calls display-
//    Digits by passing the method the integer entered. Display the results.


    private static int quo(int x, int y){ return x / y; }

    private static Integer rem(Integer x, Integer y){ return x % y; }

    public static void displayDigits(int x){

        String real = "";
        int aux = x;
        while (aux % 10 > 0) {
            Integer res = rem(aux, 10); // 2
            int quotient = quo(aux, 10); // 456
            aux = quotient;
            real += res.toString();

        }

        for (int i = real.length(); i > 0; i--){
            System.out.print(real.charAt(i - 1));
            System.out.print("  ");
        }

    }

//    Implement the following integer methods:
//    a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation
//
//    celsius = 5.0 / 9.0 * (fahrenheit - 32);

//    b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
//    the calculation

//    fahrenheit = 9.0 / 5.0 * celsius + 32;

//    c) Use the methods from parts (a) and (b) to write an application that enables the user either
//    to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
//    Celsius temperature and display the Fahrenheit equivalent.


    public static int celsius(int fahrenheit){
        double cel = 5.0 / 9.0 * (fahrenheit - 32);
        return (int)cel;
    }

    public static int fahrenheit(int celsius){
        double fah = 9.0 / 5.0 * celsius + 32;
        return (int)fah;
    }

//    Write a method minimum3 that returns the smallest of three floating-
//    point numbers. Use the Math.min method to implement minimum3 . Incorporate the method into an
//    application that reads three values from the user, determines the smallest value and displays the result.


    public static double minimum3(double x, double y, double z){ return Math.min(Math.min(x, y), z); }


//    An integer number is said to be a perfect number if its factors, including
//    1 (but not the number itself), sum to the number. For example, 6 is a perfect number,
//    because 6 = 1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
//    Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
//    the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing
//    power of your computer by testing numbers much larger than 1000. Display the results.


    public static boolean isPerfect(int x){

        int num = 0;

        for (int i = 1; i < x; i++){
            if(x % i == 0)
                num += i;
        }

        return num == x;
    }




    public static void printPerfect(int x){

        int y = 0;
        System.out.printf("%d = ", x);
        for (int i = 1; i < x; i++){
            if(x % i == 0) {
                System.out.printf("%d", i);
                y += i;
                if (y == x)
                    System.out.print("\n");
                else
                    System.out.print(" + ");
            }
        }
    }

}
