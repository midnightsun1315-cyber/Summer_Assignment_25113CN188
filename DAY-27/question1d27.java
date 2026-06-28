
import java.util.Scanner;

public class question1d27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maximum number of students");
        int size = sc.nextInt();

        String[] names = new String[size];
        int[] rollNO = new int[size];
        double[] marks = new double[size];

        int count = 0;

        while (true) {

            System.out.println("""
                    1. Add Student
                    2. View All Students
                    3. Search Student by Roll Number
                    4. Update Student Marks
                    5. Exit
                    """);

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == size) {
                        System.out.println("Student list is full.");
                    } else {

         sc.nextLine(); 

        System.out.print("Enter student name: ");
             names[count] = sc.nextLine();

         System.out.print("Enter roll number: ");
             rollNO[count] = sc.nextInt();

                System.out.print("Enter marks: ");
                        marks[count] = sc.nextDouble();

                        count++;

                        System.out.println("Student added successfully.");
                    }

                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No students added yet.");
                    } else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("------------------------");
                            System.out.println("Name : " + names[i]);
                            System.out.println("Roll : " + rollNO[i]);
                            System.out.println("Marks: " + marks[i]);
                        }
                    }

                    break;

                case 3:

                    if (count == 0) {
                        System.out.println("No students added yet.");
                        break;
                    }

                    System.out.print("Enter roll number: ");
                    int num = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (num == rollNO[i]) {

                            System.out.println("Student Found");
                            System.out.println("Name : " + names[i]);
                            System.out.println("Marks: " + marks[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    if (count == 0) {
                        System.out.println("No students added yet.");
                        break;
                    }

                    System.out.print("Enter roll number: ");
                    int m = sc.nextInt();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (m == rollNO[i]) {

                            System.out.print("Enter new marks: ");
                            marks[i] = sc.nextDouble();

                            System.out.println("Marks updated successfully.");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 5:

                    System.out.println("Thank you!");
                    sc.close();
                }
            }
        }
    }