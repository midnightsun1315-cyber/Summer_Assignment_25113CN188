import java.util.Scanner;
public class question2d24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.next();
        int count=1;
        for(int i=0; i<str.length()-1;i++){
            
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
        System.out.print(str.charAt(str.length()-1));
        System.out.print(count);
        sc.close();
    }
    
}
