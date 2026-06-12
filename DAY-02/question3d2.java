import java.util.Scanner;
public class question3d2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int b =1;
        while(num!=0){
            int a = num % 10;
            b *= a;
            num /= 10;
        }
        System.out.println("the product of the number is "  + b );
        sc.close();
    }
    
}
