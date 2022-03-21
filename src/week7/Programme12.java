package week7;
/*
 * created by Harsh Patel
 */

import java.util.Scanner;

public class Programme12 {
    //main method
    public static void main(String[] args) {
        Programme12 t = new Programme12();
        t.numbers();//calling instance method in main method
        t.numbers();//calling instance method in main method
        t.numbers();//calling instance method in main method

    }
    //instance method
    public void numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number, alphabet or character :");
        char ch = sc.next().charAt(0);
        if(Character.isDigit(ch)){
            System.out.println(ch+ " is number");
        }
        else if(Character.isAlphabetic(ch)){
            System.out.println(ch+ " is alphabet");
        }
        else
            System.out.println(ch+" is symbol");


    }
}
