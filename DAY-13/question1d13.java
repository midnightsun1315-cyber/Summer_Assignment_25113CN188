import java.util.Scanner;
public class question1d13 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("entr the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elemants : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
         System.out.println("the elemants are : "); 
          for(int i=0;i<num;i++){
        System.out.print(arr[i] + " ");

      }
      sc.close();
 }
    

    
}
