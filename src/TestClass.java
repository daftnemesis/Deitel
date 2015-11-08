import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by daftnemesis on 30/09/15.
 */
public class TestClass{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long x = 10;
        long res = x;
        for (int i = 1; i < 9; i++) {
            res = res * x;
            System.out.println(res);
        }


    }
}