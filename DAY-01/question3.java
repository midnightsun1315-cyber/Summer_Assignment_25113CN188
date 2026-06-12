import java.util.Scanner;
public class question3 {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int fact;
    System.out.println("enter the number : ");
    int num =sc.nextInt();
    fact = 1;
    for(int i=1;i<=num;i++){
        fact *= i;

    }
    System.out.println("the factorial of " + num + " is " + fact);

    sc.close();
}
}