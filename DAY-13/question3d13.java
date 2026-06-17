import java.util.Scanner;

public class question3d13 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
         int max=arr[0];
       int min=arr[0];
          for(int i=1;i<num;i++){
              if(arr[i]>max){
                max=arr[i];

              }
              
           }
      
          for(int i=0;i<num;i++){
              if(arr[i]<min){
                min=arr[i];

              }
              
           }
        System.out.println("the greatest element is : " + max); 
        System.out.println("the smallest element is : " + min); 
      sc.close();
 }
}   

    
