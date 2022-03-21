package week7;
/*
 * created by Harsh Patel
 */
import java.util.Scanner;
public class Programme6 {
    public static void main(String[] args) {
        Programme6 t = new Programme6();
        t.test7();//calling instance method via object t
        t.test7();//calling instance method via object t
        t.test7();//calling instance method via object t
    }
    //instance method
    public void test7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println(num +" is even number");
        }
        else{
            System.out.println(num +" is odd number");
        }
    }
}
