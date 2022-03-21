package week7;
/*
 * created by Harsh Patel
 */

import java.util.Scanner;

public class Programme2 {
    //main method
    public static void main(String[] args) {
        //calling instance method in main method via object
        Programme2 obj = new Programme2();
        obj.test();
        obj.test();
        obj.test();

    }

    //instance method
    //public boolean test() {
    public void test(){


        Scanner sc = new Scanner(System.in);//declaring new scanner called sc
        System.out.println("Enter any year");//print the value of entered number
        int year = sc.nextInt();//scan for user input and set it to year

        String result = ((year % 4 == 0 && year % 100 != 0) ?
                "is a leap year." : (year % 400 == 0) ?
                "is a leap year." : "is not a leap year.");
        //ternary operator check to year
        System.out.println(year +" is " +result);






//
//        if (year % 400 == 0) {
//            System.out.println(year + " is a leap year.");
//        } else if (year % 100 == 0) {
//            System.out.println(year + " is not a leap year.");
//        } else if (year % 4 == 0) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }

//        if (year % 4 == 0)
//            return true;
//        if (year % 100 == 0)
//            return false;
//        if (year % 400 == 0)
//            return false;
//
//
//        return false;


    }}











