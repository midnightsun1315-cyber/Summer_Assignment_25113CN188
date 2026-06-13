
import java.util.Scanner;
public class question4d13 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("entr the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elemants : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }

        int even =0;
        int odd =0;
          for(int i=0;i<num;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
          }

     System.out.println("total odd numbers are : " + odd);
     System.out.println("total even numbers are : " + even);

      
      sc.close();
 }
    

    
}
    

