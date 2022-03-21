package week7;
/*
 * created by Harsh Patel
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        int day = 0;
        System.out.println(getday(day));

    }

    //static method
    public static String getday(int day) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        day = sc.nextInt();

        String dayname = "";
        switch (day) {
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tueday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            case 4:
                dayname = "Thursday";
                break;
            case 5:
                dayname = "Friday";
                break;
            case 6:
                dayname = "Saturday";
                break;
            case 7:
                dayname = "Sunday";
                break;
            default:
                 dayname ="Week contains 1 to 7 days";

        }

        return dayname;



    }

}
