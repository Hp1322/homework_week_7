package week7;
/*
 * created by Harsh Patel
 */

import java.util.Scanner;//importing scanner

public class Programme5 {
    //main method
    public static void main(String[] args) {
        test5();//calling static method in main method directly

    }

    //static method
    public static void test5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee iD :");
        int e = sc.nextInt();
        System.out.println("Enter name");
        String n1 = sc.next();
        System.out.println("Enter basic salary");
        float b = sc.nextFloat();//b=basic salary
        //hra(b);

        float hra = (b*0.10f);//hra=HRA
        float da = (b*0.08f) ;//da=DA
        float ta = (b*0.09f) ;//ta=TA
        float pf = (b*0.20f) ;//pf=PA
        float gs = b + hra + ta + da - pf;//gs=Gross Salary

        System.out.println("______________________________");
        System.out.println("|          Salary slip        |");
        System.out.println("|_____________________________|");
        System.out.println("|Employee Id     :" + e+"          |");
        System.out.println("|Employee Name   :" + n1+"         |");
        System.out.println("|_____________________________|");
        System.out.println("|Basic Salary    :" + b+"       |");
        System.out.println("|HRA 10%         :" + hra+"      |");
        System.out.println("|TA 8%           :" + ta+"       |");
        System.out.println("|DA 9%           :" + da+"       |");
        System.out.println("|PF-20%          :" + pf+"       |");
        System.out.println("|________________________________|");
        System.out.println("|Gross Salary    :" + gs+"       |");
        System.out.println("|================================|");


    }


    }

