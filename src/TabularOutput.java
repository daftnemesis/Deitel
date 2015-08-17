/**
 * Created by daftnemesis on 15/08/15.
 */
public class TabularOutput {

    public static void main(String[] args) {

        System.out.println("N\t10*N\t100*N\t1000*N\n");

        int count = 1;

        while (count <= 5){
            System.out.printf("%d\t%d\t\t%d\t\t%d\n",
                    count,count*10,count*100,count*1000);
            count++;

        }
    }
}
