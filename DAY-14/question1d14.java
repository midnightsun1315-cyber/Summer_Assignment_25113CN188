
import java.util.Scanner;
public class question1d14 {
    public static void main(String[] args){  
           Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();
        }
         System.out.println(" enter the element you want to search : "); 
         int target = sc.nextInt();
        int a=0;
           boolean flag= false;
         for(int j=0; j<num;j++){
             if(target==arr[j]){
                 flag =true;
                 a=j;
                break;
            }
         }
         if(flag==true){
            System.out.println("element is found at place " + a );
         }
         else{
            System.out.println("element is not found");
         }
         sc.close();
      }
      
 }
  

    

