package week7;
/*
 * created by Harsh Patel
 */
public class Programme11 {
    public static void main(String[] args) {
        number();

    }
    //static method
    public static void number(){
        int n;
        System.out.println("\nDivided by 3");
        for (n=1;n<100;n++){
            if (n%3==0)
                System.out.print(n +",");
        }
        System.out.println("\nDivided by 5");
        for(n=1;n<100;n++){
            if(n%5==0)
                System.out.print(n +",");
        }
    }

}
