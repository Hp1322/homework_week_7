package week7;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        sales();


    }

    //static method
    public static void sales() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales Id :");
        int id = sc.nextInt();
        System.out.println("Enter Seller's name :");
        String name = sc.next();
        System.out.println("Enter sales amount :");
        double sm = sc.nextDouble();
        System.out.println("Enter salary basic :");
        int sb = sc.nextInt();
        double c=0;
        if (sm >= 50000) {
            c = (sm * 0.35);
        } else if (sm >= 30000 && sm < 49999) {
            c = (sm * 0.20);
        } else if (sm >= 20000 && sm < 29999) {
            c = (sm * 0.10);
        } else if (sm >= 10000 && sm < 19999) {
            c = (sm * 0.05);
        } else if (sm < 10000) {
            c = (sm * 0.02);
        }
        System.out.println("commission :" + c);

    }


}

