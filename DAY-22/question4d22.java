import java.util.Scanner;
public class question4d22 {
 public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
      String str = sc.nextLine();
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)!= ' '){
            System.out.print(str.charAt(i));
        }
    
}
sc.close();
}
}