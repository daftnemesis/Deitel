/**
 * Created by daftnemesis on 31/08/15.
 */
public class ProductOddIntegers {

    public static void main(String[] args) {

        int suma = 1;

        for (int i = 1; i <= 15; i++){
            if (i % 2 != 0){
                suma *= i;
            }

        }

        System.out.println(suma);

    }
}
