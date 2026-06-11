import java.util.Scanner;

public class question4d11 {
    
    static long fact(long a){
        long factorial = 1;
        for(long i=a;i>0;i--){
            factorial*=i;
            
        
        }
        return factorial;
    }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        long a =sc.nextLong();
       
        long result = fact(a);
        System.out.println("the factorial of the number " + a + " is: " + result);
        sc.close();
    }
}


    

