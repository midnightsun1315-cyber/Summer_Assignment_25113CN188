import java.util.Scanner;
public class question3d12 {
    static void fibbo(int num){
        int a=0;
        int b=1;
        for(int j=0;j<num;j++){
           System.out.print(a + " ");
           int c=a+b;
            a=b;
            b=c;
        }
        }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of terms : ");
        int num =sc.nextInt();
        
           fibbo(num);
           sc.close();
          
        
        


    }
    
}
