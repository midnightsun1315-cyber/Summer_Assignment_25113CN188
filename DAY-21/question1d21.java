import java.util.Scanner;
public class question1d21 {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
      String str = sc.next();

      char[] arr =str.toCharArray();
       int count =0;
       for(char ch : arr){
        count++;
        
       }
       System.out.println("the length of the string is : " + count);
       sc.close();
    }
    
}
