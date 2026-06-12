import java.util.Scanner;
public class question3d9 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        for (int i =65; i<=n+64; i++){
            for (int j=65;j<=i;j++){
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

