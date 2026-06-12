import java.util.Scanner;
public class question4 {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int b = 0;
        while(num!=0){
            num/=10;
            b++;
        }
        System.out.println("The number of digits in the given number is : " + b);
        sc.close();
    }
}
