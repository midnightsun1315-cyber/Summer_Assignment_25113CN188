import java.util.Scanner;
public class question4d4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range: ");
        int num = sc.nextInt();
        
       
        for(int i=1;i<=num;i++){
            int sum = 0;
           
        int m = i;
       while(m!=0){
        int a = m%10;
        m /= 10;
        sum += a*a*a;
       }
       if(sum == i){
        System.out.println(sum);
        }
       
}
  sc.close();
    }
}