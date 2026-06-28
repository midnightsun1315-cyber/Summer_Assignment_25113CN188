
import java.util.Scanner;

public class question3d27 {
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
                    3. increase salary 
                    4. highest salary
                    5. lowest salary
                    6. average salary
                    7. exit
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
                    System.out.print("Percentage increase: ");
                    int per = sc.nextInt();


                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (num == ID[i]) {
                            salary[i] += (salary[i] * per /100) ;


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
                    double max =salary[0];
                    int maxn =0;

                    for (int i = 1; i < count; i++) {

                        if (salary[i]>max) {

                            max =salary[i];
                          maxn=i;
                        }
                    }
                 System.out.println("Highest Salary" );
                   System.out.println("Employee : "+ names[maxn] );
                   System.out.println(" Salary :" + max);
                   break;

                  

                case 5:

                     if (count == 0) {
                        System.out.println("No Employees added yet.");
                        break;
                    }
                    double min =salary[0];
                    int minm =0;

                    for (int i = 1; i < count; i++) {

                        if (salary[i]<min) {

                            min =salary[i];
                          minm=i;
                        }
                    }
           
                     System.out.println("Lowest Salary" );
                   System.out.println("Employee : " + names[minm] );
                   System.out.println("Salary :" + min);
                   break;

                   case 6: 
                    if (count == 0) {
                        System.out.println("No Employees added yet.");
                        break;
                    }
                    double sum =0;
                    for (int i = 0; i < count; i++) {

                       sum+= salary[i];
                    }
                    double avg = sum/count;
                   System.out.println("the average salary is : " + avg);
                   break;

                    case 7:

                    System.out.println("Thank you!");
                    sc.close();


                }
            }
        }
    }
