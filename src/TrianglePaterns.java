/**
 * Created by daftnemesis on 31/08/15.
 */
public class TrianglePaterns {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("\n");

        for (int i = 10; i >= 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 1; i <= 10; i++){
            for (int j = i; j > 1; j--){

                System.out.print("*");

            }

            System.out.println();
        }
        
    }

    
}
