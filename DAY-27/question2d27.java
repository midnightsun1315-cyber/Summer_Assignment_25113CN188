
import java.util.Scanner;

public class question2d27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maximum number of Employee");
        int size = sc.nextInt();

        String[] names = new String[size];
        int[] ID = new int[size];
        double[] salary = new double[size];

        int count = 0;

        while (true) {

            System.out.println("""
                    1. Add Employee
                    2. View All Employee
                    3. Search Employee by ID Number
                    4. Update salary
                    5. Exit
                    """);

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
         switch (choice) {

            case 1:

           if (count == size) {
                        System.out.println("Employee list is full.");
                    } else {

         sc.nextLine(); 

        System.out.print("Enter Employee name: ");
             names[count] = sc.nextLine();

         System.out.print("Enter ID number: ");
             ID[count] = sc.nextInt();

                System.out.print("Enter Salary: ");
             salary[count] = sc.nextDouble();
                        count++;

                        System.out.println("Employee added successfully.");
                    }

                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Employees added yet.");
                                salary[count] = sc.nextDouble();
        } else {

                for (int i = 0; i < count; i++) {
                            System.out.println("Name : " + names[i]);
                            System.out.println(" ID number: " + ID[i]);
                            System.out.println("Salary: " + salary[i]);
                        }
                    }

                    break;

                case 3:

                    if (count == 0) {
                        System.out.println("No Employees added yet.");
                        break;
                    }

                    System.out.print("Enter ID number: ");
                    int num = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (num == ID[i]) {

                            System.out.println("Employee Found");
                            System.out.println("Name : " + names[i]);
                            System.out.println("Salary: " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 4:

                    if (count == 0) {
                        System.out.println("No Employees added yet.");
                        break;
                    }

                    System.out.print("Enter  number: ");
                    int m = sc.nextInt();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (m == ID[i]) {

                            System.out.print("Enter new Salary: ");
                            salary[i] = sc.nextDouble();

                            System.out.println("Salary updated successfully.");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 5:

                    System.out.println("Thank you!");
                    sc.close();
                }
            }
        }
    }
