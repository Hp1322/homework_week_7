package week7;
/*
 * created by Harsh Patel
 */
import java.util.Scanner;
public class Programme18 {
    public static void main(String[] args) {
        sum();

    }
    //static method;
    public static void sum(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int a = sc.nextInt();
        System.out.println("Enter all elements :");
        int b[]= new int[a];

        for(int i = 0; i<a; i++){
            b[i] = sc.nextInt();
            sum = sum + b[i];
        }



        System.out.println("Sum of array elements is "+sum);


    }
}
