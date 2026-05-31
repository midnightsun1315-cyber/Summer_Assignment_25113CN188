import java.util.Scanner;
public class question3d4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int m = num;
       while(num!=0){
        int a = num%10;
        num /= 10;
        sum += a*a*a;
       }
       if(sum == m){
        System.out.println("the number is an armstrong number");
        }
        else{
            System.out.println("the number is not an armstrong number");
        }
         sc.close();
}
}