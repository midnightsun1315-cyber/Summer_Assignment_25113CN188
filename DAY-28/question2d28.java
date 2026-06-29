
import java.util.Scanner;

public class question2d28{

    static Scanner sc = new Scanner(System.in);

    static String[] name;
    static int[] accountNo;
    static double[] balance;
    static int count = 0;
         
    public static void main(String[] args) {

        System.out.print("Enter maximum number of accounts: ");
        int size = sc.nextInt();

        name = new String[size];
        accountNo = new int[size];
        balance = new double[size];

        while (true) {

            System.out.println("""
    
           1. Create Account
                    2. View All Accounts
                    3. Deposit Money
                    4. Withdraw Money
                    5. Search Account
                    6. Exit
                    
                    """);

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    viewAccounts();
                    break;

                case 3:
                    depositMoney();
                    break;

                case 4:
                    withdrawMoney();
                    break;

                case 5:
                    searchAccount();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void createAccount() {

        if (count == name.length) {
            System.out.println("No space for new accounts.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNo[count] = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        balance[count] = sc.nextDouble();

        count++;

        System.out.println("Account Created Successfully.");
    }

    static void viewAccounts() {

        if (count == 0) {
            System.out.println("No Accounts Found.");
            return;
        }

        for (int i = 0; i < count; i++) {

     System.out.println("----------------------");
           System.out.println("Name : " + name[i]);
              System.out.println("Account No : " + accountNo[i]);
            System.out.println("Balance : ₹" + balance[i]);
        }
    }

    static void depositMoney() {
  System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (accountNo[i] == acc) {

                    System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();
                balance[i] += amount;
                System.out.println("Deposit Successful.");
                System.out.println("Current Balance : ₹" + balance[i]);
                return;
            }
        }

        System.out.println("Account Not Found.");
    }

    static void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (accountNo[i] == acc) {

                System.out.print("Enter Withdrawal Amount: ");
                double amount = sc.nextDouble();

                if (balance[i] >= amount) {

                    balance[i] -= amount;
                    System.out.println("Withdrawal Successful.");
                    System.out.println("Current Balance : ₹" + balance[i]);

                } else {

                    System.out.println("Insufficient Balance.");
                }

                return;
            }
        }

        System.out.println("Account Not Found.");
    }

    static void searchAccount() {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (accountNo[i] == acc) {

                  System.out.println("Account Found");
                System.out.println("Name : " + name[i]);
             System.out.println("Account No : " + accountNo[i]);
                System.out.println("Balance : ₹" + balance[i]);

                return;
            }
        }

        System.out.println("Account Not Found.");
    
}
}

