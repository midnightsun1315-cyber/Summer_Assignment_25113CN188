import java.util.Scanner;
public class question1d28 { 
    static Scanner sc=new Scanner(System.in);
    static String[] bookName;
    static int[] bookId;
    static boolean[] issued;
    static int count =0;
    public static void main(String[] args) {
        
         System.out.println("Enter maximum number of Books");
        int size = sc.nextInt();
        bookName= new String[size];
          bookId = new int [size];
     issued     = new boolean[size];

    
    
    while(true){
        displayMenu();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addBook();
                
                break;
            case 2:
                viewBook();
                
                break;
            case 3:
                searchBook();
                
                break;
            case 4:
                issueBook();
                
                break;
            case 5:
                returnBook();
                
                break;
            case 6:
                sc.close();
                
                return;
        
        }
    }
}
        static void displayMenu(){ System.out.println("""
        1. Add Book
        2. View Books
        3. Search Book
        4. Issue Book
        5. Return Book
        6. Exit
                    """);

            System.out.print("Choose an option: ");
     }     
     
     



           static void addBook(){
             if (count == bookName.length) {
                        System.out.println("Library full.");
                    } else {

         sc.nextLine(); 

        System.out.print("Enter Book name: ");
             bookName[count] = sc.nextLine();

         System.out.print("Enter ID number: ");
             bookId[count] = sc.nextInt();
             issued[count] =false;
             count++;
       System.out.println("Book added successfully.");
     }
    }
         



        static void viewBook(){

    if(count == 0){
        System.out.println("No books available");
        return;
    }

    for(int i=0;i<count;i++){

        System.out.println(bookId[i] + " " + bookName[i]);

        if(issued[i]){
            System.out.println("Issued");
        }
        else{
            System.out.println("Available");
        }
    }
}



           static void searchBook(){
            if (count == 0) {
                        System.out.println("No Employees added yet.");
                        return;
                    }

                    System.out.print("Enter ID number: ");
                    int num = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (num == bookId[i]) {

                            System.out.println("BookFound");
                            System.out.println("Name : " + bookName[i]);
                            System.out.println("BookId: " + bookId[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
           }


           static void issueBook(){
            System.out.println("Enter the Book Id");
            int id = sc.nextInt();
            for(int i = 0; i < count; i++) {

    if(bookId[i] == id) {

        if(issued[i]) {
            System.out.println("Book is already issued.");
        }
        else {
            issued[i] = true;
            System.out.println("Book issued successfully.");
        }

        return;
    }
}

System.out.println("Book not found.");
           }


         static void returnBook(){
            
          System.out.println("Enter the Book Id");
            int id = sc.nextInt();

            for(int i = 0; i < count; i++) {

    if(bookId[i] == id) {

        if(!issued[i]) {
            System.out.println("Book is already available.");
        }
        else {
            issued[i] = false;
            System.out.println("Book returned successfully.");
        }

        return;
    }
}

System.out.println("Book not found.");
         }


     }
