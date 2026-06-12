import java.util.Scanner;
public class question4d12 {
    static boolean perfect(int num){
       int sum=0;
       for(int i=1;i<=num/2;i++){
        if (num%i==0){
       
         sum+=i;
        }
    }
          return sum==num ;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num =sc.nextInt();
        boolean result = perfect(num);
        System.out.println("the number is perfect: " + result);
        
        sc.close();
    }
}

