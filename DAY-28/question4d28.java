import java.util.Scanner;
public class question4d28 {
    static Scanner sc = new Scanner(System.in);
     static String[] name;
       static String[] phone;
    static int count = 0;

    public static void main(String[] args) {

        System.out.print("Enter maximum number of contacts: ");
        int size = sc.nextInt();
           name = new String[size];
        phone = new String[size];
        while (true) {

            System.out.println("""                   
                    1. Add Contact
                    2. View Contacts
                    3. Search Contact
                    4. Update Contact
                    5. Delete Contact
                    6. Exit                   
                    """);

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

  switch (choice) {

          case 1:
                    addContact();
                    break;
             case 2:
                    viewContacts();
                    break;
                case 3:
              searchContact();
                    break;

                case 4:
                    updateContact();
                    break;

                case 5:
                    deleteContact();
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

    static void addContact() {

        if (count == name.length) {
            System.out.println("Contact List Full.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone[count] = sc.nextLine();

        count++;

        System.out.println("Contact Added Successfully.");
    }
    static void viewContacts() {

        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("---------------------");
            System.out.println("Name : " + name[i]);
            System.out.println("Phone: " + phone[i]);
   }
    }

    static void searchContact() {

        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String search = sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(search)) {

                System.out.println("Contact Found");
                System.out.println("Name : " + name[i]);
                System.out.println("Phone: " + phone[i]);
                return;
     }
        }

        System.out.println("Contact Not Found.");
    }

    static void updateContact() {

        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String search = sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(search)) {

                System.out.print("Enter New Phone Number: ");
                phone[i] = sc.nextLine();

                System.out.println("Contact Updated Successfully.");
                return;        }
        }

        System.out.println("Contact Not Found.");
    }

    static void deleteContact() {

        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name to Delete: ");
        String search = sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(search)) {

                for (int j = i; j < count - 1; j++) {

                    name[j] = name[j + 1];
                    phone[j] = phone[j + 1];
                }
                name[count - 1] = null;
                phone[count - 1] = null;

                count--;

                System.out.println("Contact Deleted Successfully.");
                return;
      }
        }

        System.out.println("Contact Not Found.");
    }
}



