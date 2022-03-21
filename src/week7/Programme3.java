package week7;
/*
 * created by Harsh Patel
 */

import java.util.Scanner;//importing scanner

public class Programme3 {
    //main method
    public static void main(String[] args) {
        test3();

    }

    //static method
    public static void test3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Name");
        String n = sc.nextLine();
        System.out.println("Enter roll no");
        int r = sc.nextInt();
        System.out.println("Enter marks in maths");
        int m1 = sc.nextInt();

        System.out.println("Enter marks in science");
        int m2 = sc.nextInt();

        System.out.println("Enter marks in english");
        int m3 = sc.nextInt();
        if(m1< 0 || m1>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }else if(m2< 0 || m2>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }else if (m3< 0 || m3>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }else {

            int t = m1 + m2 + m3;
            float p = (float) (t * 0.3);
            String g = "";

            if (p >= 80)
                g = "A+";
            else if (p >= 60)
                g = "A";
            else if (p >= 50)
                g = "B";
            else if (p >= 35)
                g = "C";
            else if (p < 35)
                g = "D";

            System.out.println("_______________________________");
            System.out.println("|       Mark Sheet            |");
            System.out.println("|_____________________________|");
            System.out.println("|Name       :" + n+"               |");
            System.out.println("|Roll no:   :" + r+"               |");
            System.out.println("|_____________________________|");
            System.out.println("|Subjects   : Marks           |");
            System.out.println("|_____________________________|");
            System.out.println("|Math       :" + m1+"               |");
            System.out.println("|Science    :" + m2+"               |");
            System.out.println("|English    :" + m3+"               |");
            System.out.println("|_____________________________|");
            System.out.println("|Total      :" + t+"              |");
            System.out.println("|_____________________________|");
            System.out.println("|Percentage :" + p+"             |");
            System.out.println("|Result     :" + passfail(p)+"             |");
            System.out.println("|Grade      :" + g+"                |");
            System.out.println("|_____________________________|");
        }

    }

    public static String passfail(float p){
        String sr;
        if (p>=35){
            sr = "Pass";
        }
        else {
            sr = "Fail";
        }
        return sr;
    }

}
