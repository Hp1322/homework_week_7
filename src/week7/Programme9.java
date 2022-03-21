package week7;
/*
 * created by Harsh Patel
 */
import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        char q = 0 ;
       // getCityName(q);
        System.out.println(getCityName(q));


    }

    public static String getCityName(char q) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet");
        q = sc.next().charAt(0);

         String cityname = "";
        switch (q) {
            case 'a': case 'A':

                cityname = "Ahmedabad";
                break;
            case 'b':
            case 'B':
                cityname = "Baroda";
                break;
            case 'c':
            case 'C':
                cityname = "Chennai";
                break;
            case 'd':
            case 'D':
                cityname = "Dahod";
                break;
            case 'e':
            case 'E':
                cityname = "East ham";
                break;
            case 'f':
            case 'F':
                cityname = "Faisalpur";
                break;
            default:
                cityname = "Invalid entry";
                break;
        }
        return cityname;


    }
}
