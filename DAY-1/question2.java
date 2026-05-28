import java.util.Scanner;
public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the number : ");
        int num =sc.nextInt();
        for(int i=1;i<=10;i++){
            a=num*i;
            System.out.println( num + " x " + i + " = " + a);

        }


   sc.close();

        
    }
}
