import java.util.Scanner;
public class question1d22 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
      String str = sc.nextLine();
      boolean flag= true;
       for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            flag= false;
            break;

        }
       
       }
       if(flag==true){
      System.out.println(" string is Palindrome");
       }
       else{
      System.out.println(" string is not Palindrome");
       }
       sc.close();
    }
    
}
   

