import java.util.Scanner;
public class question1d6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number : ");
        int num = sc.nextInt();
        int b=0;
        int a=1;
        while(num!=0){
          int rem=num%2;
            b +=rem*a ;
            a*=10;
            num/=2;

        }
        System.out.println("the binary of this number is : " + b);
        sc.close();
    }
}