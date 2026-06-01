import java.util.Scanner;
public class question4d5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number : ");
        int num = sc.nextInt();
        
        int b = 0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
               boolean flag = true;
            
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
              b=i;
            }
               }
            }
          System.out.println("the largest prime factor is : "+b);
        
         sc.close();
        }
    }

    


