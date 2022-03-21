package week7;
/*
 * created by Harsh Patel
 */
import java.util.Scanner;
public class Programme4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year : ");
        int b = sc.nextInt();
        System.out.println("enter a month : ");
        int c = sc.nextInt();
        System.out.println("\n"+b+ " "+ isLeapYear(b));//calling static method in main method
        System.out.println("Month "+c+" of the year " +b +" has "+getDaysInMonth(c, b)+" days");
    }

    //static method
    public static String isLeapYear(int a) {
        String year;
        if (a > 0 && a < 10000) { //if year is equal 1 to 9999
            if (a % 4 == 0 && a % 100 != 0) {
                year = "is leap year";
            } else if (a % 4 == 0 && a % 100 == 0 && a % 400 == 0) {
                year = "is leap year";
            } else
                year = "is not a leap year";
        } else // if year is not equal 1 to 9999
            year = "is not a valid entry : return -1";
        return year;
    }

    // static method
    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;

        switch (month) {
            case 1: //Jan
            case 3: //Mar
            case 5: //May
            case 7: //July
            case 8://Aug
            case 10://Oct
            case 12://Dec
                daysInMonth = 31;
                break;
            case 4://Apr
            case 6://Jun
            case 9://Sept
            case 11://Nov
                daysInMonth = 30;
                break;
            case 2://Feb
                if (((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))) { //check if year is leap year
                    daysInMonth = 29;
                } else { //if year is not leap year
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month: return -1");
                break;
        }

        return daysInMonth;
    }
}

