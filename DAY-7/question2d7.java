import java.util.Scanner;
public class question2d7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
           System.out.println("enter the number");
                 int n= sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(fibo(i) + " ");
        }
       
        sc.close();
    }
    static int fibo(int n){
       if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
             return fibo(n-1) + fibo(n-2);
    }
    
}
    