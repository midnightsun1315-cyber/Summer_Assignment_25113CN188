import java.util.Scanner;
public class question2d4 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth term: ");
    int num = sc.nextInt();
    int a=0,b=1;
    int c=0;
    for(int i=0;i<=num-3;i++){
        c=a+b;
        
        a=b;
        b=c;

    }
      System.out.print("the nth term of the fibonacci series is " + c );
      sc.close();
}
    
}
