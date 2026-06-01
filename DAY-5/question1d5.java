import java.util.Scanner;
//to check whether the number is perfect or not

public class question1d5 {
    public static void main(String[] args) {

    
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number : ");
    int num = sc.nextInt();
    int sum = 0;
    for(int i=1;i<=num/2;i++){
        if ( num%i==0){
            sum+=i;
        }
    }
       if(num==sum){
        System.out.println("IT IS A PERFECT NUMBER");
       }
       else{
        System.out.println("NOT A PERFECT NUMBER");
       }
       sc.close();
    }
    
}


