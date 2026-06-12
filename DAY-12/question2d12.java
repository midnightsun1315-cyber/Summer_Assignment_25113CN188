import java.util.Scanner;

public class question2d12 {
    static boolean armstrong(int num){
        int b=0;
        int n=0;
        int num1=num;
        while(num!=0){
            num=num/10;
            n ++;
        } 
         num=num1;
          while(num!=0){
           int a =num%10;
            b = ((int)Math.pow(a,n)) +b ;
            num/=10;
          }
          return num1==b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num =sc.nextInt();
        boolean result = armstrong(num);
        System.out.println("the number is armstrong number: " + result);
        
        sc.close();
    }
}
    

