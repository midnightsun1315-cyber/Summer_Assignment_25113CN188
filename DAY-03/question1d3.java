import java.util.Scanner;
public class question1d3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        boolean flag =true;
    for(int i = 2; i<= num/2 ; i++){
        if(num%i==0){
         
            flag = false;
            break;
        }
    
            
        }
       
        if(flag){
            System.out.println("the nummer is PRIME");
        }
        else{
            System.out.println("the nummer is not PRIME");
        }

          sc.close();   

    }
        
           
      
        
    
       
    
}

