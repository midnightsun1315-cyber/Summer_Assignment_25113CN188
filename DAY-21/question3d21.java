import java.util.Scanner;

public class question3d21 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
      String str = sc.next();

      char[] arr =str.toCharArray();
     int vowel=0;
     int cons=0;
       for(char ch: arr){
       if(ch== 'a' || ch=='e' ||ch=='i'||ch=='o'||ch== 'u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        vowel++;

       }
          else{
            cons++;
          }

       
       }
       System.out.println("the number of vowls are : " + vowel);
       System.out.println("the number of consonants are : " + cons);
      
       sc.close();
    }
    
}
   

