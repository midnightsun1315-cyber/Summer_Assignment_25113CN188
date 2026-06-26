import java.util.Scanner;
public class question2d26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NAME");
        String name = sc.nextLine();
        System.out.println("Enter your AGE");
        int age = sc.nextInt();
        System.out.println("Are you an Indian citizen? (Y/N)");
         String input = sc.next();
         if(age<18 || (input == "N" || name == "n") ){
            System.out.println(name +" not Eligible to vote");
         }
         else{
              System.out.println(name +"  Eligible to vote");
         }
         sc.close();
    }
    
}
