import java.util.Scanner;

public class question2d22 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
      String str = sc.nextLine();
        int count=0;
   for(int i=0;i<str.length();i++){
        if(str.charAt(i) == ' '){
          count++;
       
       }
    }
      System.out.println("word = " + (count+1));
       sc.close();
    
    

   
}
}  

