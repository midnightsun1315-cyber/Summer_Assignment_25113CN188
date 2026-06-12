import java.util.Scanner;
public class question4d7 {
    static int a=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
          int n = sc.nextInt();
          rev(n);
          System.out.println(n + " the reverse of the number is : " + a);
          sc.close();

    }
    static void rev(int n){
        if(n==0){
            return;
        }
      a= (a*10) + (n%10);
        rev(n/10);
    }

    
}
