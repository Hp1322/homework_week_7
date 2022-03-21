package week7;
/*
 * created by Harsh Patel
 */
import java.util.Scanner;
public class Programme19 {
    public static void main(String[] args) {
        ave1();

    }
    //static method;
    public static void ave1(){
        int sum = 0; float ave = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int a = sc.nextInt();
        System.out.println("Enter all elements :");
        int b[]= new int[a];

        for(int i = 0; i<a; i++){
            b[i] = sc.nextInt();
            sum = sum + b[i];
            ave = (float)sum/a;
        }



        System.out.println("Average of array elements is "+ave);


    }
}