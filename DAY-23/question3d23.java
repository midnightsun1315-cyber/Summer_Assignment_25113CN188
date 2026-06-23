
import java.util.Arrays;
import java.util.Scanner;
public class question3d23 {
    
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the first string : ");
      String str1 = sc.nextLine();
    System.out.println("enter the second string : ");
      String str2 = sc.nextLine();
      char[] arr1= str1.toCharArray();
      char[] arr2= str2.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      if(arr1.length != arr2.length){
        System.out.println("the strings are not anagram");
      }
         boolean flag=true;
      for(int i=0;i<str1.length();i++){
          if(arr1[i] != arr2[i]) {
            flag = false;
            break;
             }
        }
         if(flag==true){
         System.out.println("the strings are anagram");
         }
         else{
             System.out.println("the strings are not anagram");
         }
          sc.close();


     
    }

}















