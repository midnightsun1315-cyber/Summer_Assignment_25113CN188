import java.util.Scanner;
public class question4d3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number : ");
    int num1 = sc.nextInt();
    System.out.println("enter the second number : ");
    int num2 = sc.nextInt();
    int lcm;
    int limit;
        if(num2>num1){
          limit = num1;
        }else{
            
        limit = num2;
        }
        int gcd = 1;
       for(int i = limit; i>=2;i--){
          if(num1%i==0 && num2%i==0){
            gcd =i;
            break;
          }
       }
     int a=num1/gcd;
     int b=num2/gcd;
     lcm=a*b*gcd;
    System.out.println("the lcm of the numbers is : " + lcm);
    sc.close();

    } 
}
