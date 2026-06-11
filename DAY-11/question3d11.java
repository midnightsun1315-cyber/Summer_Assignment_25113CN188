import java.util.Scanner;

public class question3d11 {
    static boolean prime(int a){
        boolean isPrime = true;
        if (a<=1){
            return false;
        }
        
        for(int i=2;i<=a/2;i++){
            if (a%i==0){
                return false;
            }
           
        }
        return isPrime;
           
            
        }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a =sc.nextInt();
       
        boolean result = prime(a);
        System.out.println("the number is prime: " + result);
        sc.close();
    }
}

    

