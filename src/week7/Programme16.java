package week7;
/*
 * created by Harsh Patel
 */
import java.util.Scanner;
public class Programme16 {
    //main method
    public static void main(String[] args) {
        Programme16 x = new Programme16();//object x
        x.checknumbers();//calling instance method in main method via object
    }
    //instance method
    public void checknumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int a = sc.nextInt();
        if (a>0){
            System.out.println(a+" is positive number");
        }else if(a<0){
            System.out.println(a+" is negative number");
        }else{
            System.out.println(a+ " is zero");
        }

    }
}
