import java.util.Scanner;

/**
 * Created by daftnemesis on 6/09/15.
 */
public class BuscadorMaximo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba tres valores de punto flotante, separados por puntos: ");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double resultado = maximo( num1, num2, num3 );

        System.out.println("El maximo es: " + resultado);
    }


    public static double maximo(double x, double y, double z){

        double valorMax = x;

        if (y > valorMax){
            valorMax = y;
        }

        if (x > valorMax){
            valorMax = z;
        }

        return valorMax;
    }

}

