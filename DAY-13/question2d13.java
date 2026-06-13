import java.util.Scanner;

public class question2d13 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    System.out.println("entr the size of an array : ");
      int num = sc.nextInt();
      int[] arr = new int[num];
      System.out.println("enter the elemants : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
      int sum=0;
          for(int i=0;i<num;i++){
           sum += arr[i];

      }
      double avg = (double) sum/num;
      System.out.println("the sum of the elements of an array is : " + sum);
      System.out.println("the average of the elements of an array is : " + avg);
      sc.close();
 }
      
      
    
}
   

    
