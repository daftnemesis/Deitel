import java.util.Arrays;

/**
 * Created by daftnemesis on 18/10/15.
 */
public class ArrayManipulations {

    public static void main(String[] args){

        //sort doubleArray into ascending order
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");

        for( double value : doubleArray){
            System.out.printf("%.1f", value);
        }

        //fill 10-element array with 7s
        int[] filledArray = new int[10];
        Arrays.fill(filledArray, 7);
        displayArray(filledArray, "filledArray");

        //copy array intArray into intArrayCopy
        int[] intArray = {1,2,3,4,5,6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray: ");
        displayArray(intArrayCopy, "intArrayCopy: ");

        //compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",
                (b ? "==": "!="));

        //compare intArray and filledArray for equality
        b = Arrays.equals(intArray, filledArray);
        System.out.printf("%n%nintArray %s filledArray%n",
                (b ? "==": "!="));

        //search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);

        if(location >= 0)
            System.out.printf("Found 5 at element %d in intArray%n", location);
        else
            System.out.println("5 not found in intArray");


    }

    private static void displayArray(int[] filledArray, String description) {

        System.out.printf("%n%s: ", description);

        for( int value : filledArray)
            System.out.printf("%d ", value);

    }
}
