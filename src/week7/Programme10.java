package week7;
/*
 * created by Harsh Patel
 */

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        calculation();

    }

    //static method
    public static void calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        System.out.println("Enter the symbol as per choice (+,-,*,/) :");
        char ch = sc.next().charAt(0);

        if (ch == '+') {
            System.out.println("Addition of " + a + "+" + b + " = " + (a + b));
        }
        else if (ch == '-') {
            System.out.println("Subtraction of " + a + "-" + b + " = " + (a - b));
        }
        else if (ch == '*') {
            System.out.println("Subtraction of " + a + "*" + b + " = " + (a * b));
        }
        else if (ch == '/') {
                System.out.println("Subtraction of " + a + "/" + b + " = " + (a / b));
        }
        else
            System.out.println("symbol is not available");

        }}
