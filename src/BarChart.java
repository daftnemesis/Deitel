import java.util.Scanner;

/**
 * Created by daftnemesis on 2/09/15.
 */
public class BarChart {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int v,w,x,y,z;

        System.out.println("Introduce 5 números enteros entre el 1 al 30 separados por coma: ");
        v = entrada.nextInt();
        w = entrada.nextInt();
        x = entrada.nextInt();
        y = entrada.nextInt();
        z = entrada.nextInt();

        printChart(v);
        printChart(w);
        printChart(x);
        printChart(y);
        printChart(z);


    }

    public static void printChart(int x){

        for (int i = 0; i < x; i++){
            System.out.print("*");
        }

        System.out.println();

    }
}
