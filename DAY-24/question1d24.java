import java.util.Scanner;

public class question1d24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String str1 = sc.next();
        System.out.println("enter the second string : ");
        String str2 = sc.next();
        if(str1.length()!=str2.length()){
            System.out.println("not rotation");
        }
       else{
       String temp = str1 + str1;

        
        if(temp.contains(str2)){
            System.out.println("rotation");
        }
        else{
            System.out.println("not rotation");

        }
    }
        sc.close();
    }
    
}
