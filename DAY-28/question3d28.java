import java.util.Scanner;
public class question3d28 {
  

    static Scanner sc = new Scanner(System.in); 
    static String[] passengerName;
     static boolean[] booked;
     static int size;

    public static void main(String[] args) {

        System.out.print("Enter total number of seats: ");
        size = sc.nextInt();
             passengerName = new String[size];
        booked = new boolean[size];

        while (true) {

            System.out.println("""       
                    1. Book Ticket
                    2. Cancel Ticket
                    3. View Booked Tickets
                    4. Exit
                    """);

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bookTicket();
                    break;

                case 2:
                    cancelTicket();
                    break;

                case 3:
                    viewTickets();
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void bookTicket() {

        System.out.print("Enter Seat Number (1-" + size + "): ");
        int seat = sc.nextInt();

        if (seat < 1 || seat > size) {
            System.out.println("Invalid Seat Number.");
            return;
        }

        if (booked[seat - 1]) {
            System.out.println("Seat already booked.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        passengerName[seat - 1] = sc.nextLine();

        booked[seat - 1] = true;

        System.out.println("Ticket Booked Successfully.");
    }

    static void cancelTicket() {
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        if (seat < 1 || seat > size) {
            System.out.println("Invalid Seat Number.");
            return;
        }
        if (!booked[seat - 1]) {
            System.out.println("Seat is already available.");
            return;
        }

        booked[seat - 1] = false;
        passengerName[seat - 1] = null;
        System.out.println("Ticket Cancelled Successfully.");
    }

    static void viewTickets() {

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (booked[i]) {
                System.out.println("----------------------");
                System.out.println("Seat Number : " + (i + 1));
                System.out.println("Passenger   : " + passengerName[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Tickets Booked.");
        }
    }
}

