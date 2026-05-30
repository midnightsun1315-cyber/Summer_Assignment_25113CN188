import java.util.Scanner;
public class question2d3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range : ");
        int num = sc.nextInt();
        
         if(num>=2)System.out.println(2);
         if(num>=3)System.out.println(3);
         for(int a=4; a<=num; a++){
             boolean flag =true;
    for(int i = 2; i<= a/2 ; i++){
        if(a%i==0){
         
            flag = false;
            break;
        }
    
            
    }

        if(flag){
            System.out.println(a);
        }
         }
    sc.close();
    }
    
}
