import java.util.Scanner;
public class question1d20 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows of first matrix: ");
      int row1 = sc.nextInt();
    System.out.println("enter the column of first matrix : ");
      int col1 = sc.nextInt();
    System.out.println("enter the rows of second matrix : ");
      int row2 = sc.nextInt();
    System.out.println("enter the column of second matrix : ");
      int col2 = sc.nextInt();
       int[][] arr1=new int[row1][col1];
       int[][] arr2=new int[row2][col2];
       int[][] arr3=new int[row1][col2];
        System.out.println("enter the elements of first matrix : ");
      for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
        arr1[i][j]= sc.nextInt();
        }
    }
        System.out.println("enter the elements of second matrix : ");
      for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
        arr2[i][j]= sc.nextInt();
        }
    }
      for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
            for(int k=0;k<col1;k++)
        arr3[i][j] += arr1[i][k]*arr2[k][j];
        }
    }
    System.out.println  ("the multiplication of matrices is: ");
    for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
        System.out.print(arr3[i][j] + " ");
        }
        System.out.println();
      }
    sc.close();
}
}