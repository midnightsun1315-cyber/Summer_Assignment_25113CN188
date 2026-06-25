import java.util.Scanner;

public class question2d25 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the  first string : ");
      String str1 = sc.nextLine();
      
    System.out.println("enter the second string : ");
      String str2 = sc.nextLine();
      for(int i=0;i<str1.length();i++){
        for(int j=0;j<str2.length();j++){
            boolean flag=false;
        for(int k=0;k<i;k++){
          if(str1.charAt(i) == str1.charAt(k)) {
            flag = true;
            break;
          }
        }
          if(flag) {
            continue;
          }
          if(str1.charAt(i)==str2.charAt(j)){
            System.out.print(str1.charAt(i));
          }
      }
    }
    sc.close();

}
}