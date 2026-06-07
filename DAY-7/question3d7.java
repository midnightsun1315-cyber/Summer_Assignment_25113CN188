import java.util.Scanner;
public class question3d7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            System.out.println("enter the number");
        int n= sc.nextInt();
            System.out.println("the sum of digits of number is : " + sum(n));
        sc.close();
    }
    static int sum(int n){
        if(n==0){
    return 0;
        }
     return (n % 10) + sum(n / 10);
    }
    
}

