import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number : ");
        int num= sc.nextInt();
        int sum =0;
        for(int i=0; i<=num; i++){
            sum +=i;
        }
        System.out.println("The sum of numbers from 0 to " + (num) + " is: " + sum);
        sc.close();
    }}