import java.util.Scanner;

/**
 * Created by daftnemesis on 2/09/15.
 */
public class CalculandoVentas {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int cantidad;
        int producto = 1;
        double total = 0;

        while (producto != 0){
            System.out.println("Elige una opcion:\n " +
                    "0.- Salir\n" +
                    "1.- Producto 1\n" +
                    "2.- Producto 2\n" +
                    "3.- Producto 3\n" +
                    "4.- Producto 4\n" +
                    "5.- Producto 5\n");

            producto = sc.nextInt();

            System.out.print("Elige una cantidad: ");
            cantidad = sc.nextInt();

            switch (producto){
                case 1:
                    total += (2.98 * cantidad);
                    break;

                case 2:
                    total += (4.50 * cantidad);
                    break;

                case 3:
                    total += (9.98 * cantidad);
                    break;

                case 4:
                    total += (4.49 * cantidad);
                    break;

                case 5:
                    total += (6.87 * cantidad);
                    break;
            }
        }

        System.out.println(total);



    }
}
