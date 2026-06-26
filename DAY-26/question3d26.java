import java.util.Scanner;
public class question3d26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        while(true){
        System.out.println("""
        WELCOME TO THE XYZ ATM
        Choose the service
        1. Check Balance : press (1)
        2. Deposit : press (2)
        3. Withdraw :press (3)
        4. Exit : press (4)
        """) ;
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :

                System.out.println( "your current balance is : " + balance);
                
                break;
            case 2 :  System.out.println("how much you want to deposit"); 
            int deposit = sc.nextInt();
            System.out.println("current amount equals : " + (balance + deposit) ); 
            break;

         case 3 :  System.out.println("how much you want to withdraw"); 
          int withdraw = sc.nextInt();
          balance -= withdraw;
          if(withdraw< balance){
            System.out.println("insufficient balace");
          }
          else{
            System.out.println("current amount equals : " + balance  );
          }
            break;
             case 4 : System.out.println("THANK YOU FOR USING ATM"); 
             sc.close();
             return;
            default: System.out.println("INVALID CHOICE");
                break;
        }
        }
         
        }
      }
