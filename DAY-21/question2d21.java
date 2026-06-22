import java.util.Scanner;
public class question2d21 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
      String str = sc.next();

      char[] arr =str.toCharArray();
      System.out.println("the revere of the array is : ");
       for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]);

       
       }
      
       sc.close();
    }
    
}
   