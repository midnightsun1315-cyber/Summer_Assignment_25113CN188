 import java.util.Scanner;
//to check whether the number is perfect or not

public class question2d5 {
    public static void main(String[] args) {

    
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number : ");
    int num = sc.nextInt();
    int a;
    int fact=1;
    int sum=0;
    int num1=num; 
    while(num!=0){
        a=num%10;
        num=num/10;
        for(int i=a;i>=1;i--){
            fact*=i;
        }
        sum+=fact;
        fact=1; // Reset fact 
    }
        if(sum==num1){
            System.out.println("IT IS A STRONG NUMBER");
        }
        else{
            System.out.println("NOT A STRONG NUMBER");
        }
        sc.close();
    }
    
}


