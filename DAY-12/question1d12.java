import java.util.Scanner;
public class question1d12 {
    static boolean palindrome(int num){
        boolean flag=false;
        int b=0;
        int num1=num;
          while(num!=0){
           int a =num%10;
            b = (b*10) +a ;
            
            
            num/=10;
          }
          if (num1 == b){
            return true;
          }
          return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num =sc.nextInt();
        boolean result = palindrome(num);
        System.out.println("the number is palindrome: " + result);
        
        sc.close();
    }
}