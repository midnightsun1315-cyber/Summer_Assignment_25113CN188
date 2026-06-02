import java.util.Scanner;
public class question4d6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        System.out.println("enter the power : ");
        int m = sc.nextInt();
        int a=1;
         for(int i=0;i<m;i++){
            a *=num;
         }
         System.out.println("the value is " + a);
         sc.close();
    }
    
}
