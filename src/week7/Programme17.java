package week7;
/*
 * created by Harsh Patel
 */
import java.util.Arrays;
public class Programme17 {
    public static void main(String[] args) {
        arrays();//calling static method in main method directly

    }
    //static method
    public static void arrays(){
        int [] array1 = {18, 58, 100, 0, 85, 122,560};
        String [] array2 = {"ab", "mck", "zf", "pe", "hl", "hk", "we"};
        System.out.println("Original numeric array :" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(array1));

        System.out.println("Original numeric array :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted numeric array :" + Arrays.toString(array2));
    }
}
