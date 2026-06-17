import java.util.Scanner;

public class question2d14 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
         System.out.println("enter the element : "); 
        int target =sc.nextInt();
        
        int count =0;
        for(int j=0;j<num;j++){
            if(target==arr[j]){
                count++;
            }
         }
        System.out.println("the frequency of the element is : " + count);
      sc.close();
 }
    

    
}

    
