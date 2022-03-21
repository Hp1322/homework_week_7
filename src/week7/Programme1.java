package week7;
/*
 * created by Harsh Patel
 */
import  java.util.Scanner;//importing scanner
public class Programme1 {
    //main method
    public static void main(String[] args) {
        number();//calling static method in main method
        number();
        number();

    }

    //static method
    public static void number(){
        Scanner sc = new Scanner(System.in);//declaring new scanner called sc
        System.out.println("Enter Number :");//print the value of entered number
        int num = sc.nextByte();//scan for user input and set it to num
        //ternary operator to check number
        String result = num%2==0? "Even" : "Odd";
        System.out.println(num +" is " +result);
    }
}
