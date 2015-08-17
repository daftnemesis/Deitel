/**
 * Created by daftnemesis on 16/08/15.
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.printf("%d", factorial(6));

    }

    public static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return n * factorial(n -1);
    }
}
