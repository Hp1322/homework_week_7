package week7;
/*
 * created by Harsh Patel
 */
import java.util.Scanner;
public class Programme8 {
    public static void main(String[] args) {
        char z = 0;
        alphabet(z);

    }

    public static char alphabet(char z) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet");
        z = sc.next().charAt(0);

        if (z == 'a') {
            System.out.println("arizona");
        } else if (z == 'b') {
            System.out.println("bilaspur");
        } else if (z == 'c') {
            System.out.println("chennai");
        } else if (z == 'd') {
            System.out.println("dang");
        } else if (z == 'e') {
            System.out.println("east london");
        } else if (z == 'f') {
            System.out.println("fulham");
        }
        return z;


    }

}
