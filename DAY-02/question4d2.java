import java.util.Scanner;
public class question4d2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     System.out.println(" entr the number : ");
     int num = sc.nextInt();
     int b=0;
     int num1 = num;
     while(num!=0){
       int a = num%10;
        b+=a;
        b*=10;
        num/=10;

     }
     if(num1 == b/10 ){
        System.out.println("the number is palindrome");
     }
     else{
        System.out.println("the number is not palindrome");
     }
     sc.close();
    }
    
}
