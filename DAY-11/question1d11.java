import java.util.Scanner;

public class question1d11 {
     static int printsum(int a , int b){
           
            return a+b;
        }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a =sc.nextInt();
        System.out.println("enter the second number: ");
        int b =sc.nextInt();
        int result = printsum(a, b);
        System.out.println("the sum is: " + result);
        sc.close();
    }
}
