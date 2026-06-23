import java.util.Scanner;
public class question1d23 {
    
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
      String str = sc.nextLine();
      for(int i=0;i<str.length();i++){
        boolean flag=false;
        for(int k=0;k<i;k++){
          if(str.charAt(i) == str.charAt(k)) {
            flag = true;
            break;
          }
        }
          if(flag) {
            continue;
          }
        
        int count=0;
      for(int j=0;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
           
           count++;
        
      }
    }
    if(count==1){
      System.out.println("the first non repeating character is : " + str.charAt(i));
      break;
    }
         
      }
     
 sc.close();

}
     
    }

















