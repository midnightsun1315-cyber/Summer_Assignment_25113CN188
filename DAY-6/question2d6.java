import java.util.Scanner;
public class question2d6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number : ");
        int num = sc.nextInt();
        int b=0;
        int m=0;
        while(num!=0){
            int a =num%10;
            b+= a*Math.pow(2,m);
            m++;
            num/=10;
        }
        System.out.println(" the decimal form is : " + b);
        sc.close();
    }
    
}
