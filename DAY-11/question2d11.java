import java.util.Scanner;
public class question2d11 {
    static int maximum(int a , int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
        }
           
       
    
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a =sc.nextInt();
        System.out.println("enter the second number: ");
        int b =sc.nextInt();
        int result = maximum(a, b);
        System.out.println("the maximum number is: " + result);
        sc.close();
    }
}
