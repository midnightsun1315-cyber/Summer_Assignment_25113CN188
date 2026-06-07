
import java.util.Scanner;
public class question1d7 {
    public static void main(String[] args) {
             Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int i= sc.nextInt();
            System.out.println("the factorial of the number is : " + fact(i));
         sc.close();
    }
    static int fact(int i){
        if(i==1 || i==0){
            return 1;
        }
 return i*fact(i-1);
    }
    
}
