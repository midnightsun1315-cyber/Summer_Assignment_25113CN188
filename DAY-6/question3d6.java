import java.util.Scanner;
public class question3d6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int count=0;
        while(num!=0){
        int a=num%2;
           if(a==1){
            count++;
           }
           num/=2;
        }

        System.out.println("the bit count of the number is : " + count);
        sc.close();

    }
    
}
