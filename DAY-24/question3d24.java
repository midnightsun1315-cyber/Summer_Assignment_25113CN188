import java.util.Scanner;
public class question3d24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String str= sc.nextLine();
        String longest= "";
          String word= "";
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)!= ' '){
                word += str.charAt(i);
             }
            else{
             if(word.length()>longest.length()){
                longest = word;

             }
            
             word = "";
            }
        }
        if(word.length()>longest.length()){
            longest = word;
        }
         System.out.println("the longest word is : " + longest);
        sc.close();
    }
    
}