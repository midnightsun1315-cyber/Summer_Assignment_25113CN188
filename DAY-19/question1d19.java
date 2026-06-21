import java.util.Scanner;
public class question1d19 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows : ");
      int row = sc.nextInt();
    System.out.println("enter the column : ");
      int col = sc.nextInt();
       int[][] arr=new int[row][col];
       int[][] arr2=new int[row][col];
       int[][] arr3=new int[row][col];
        System.out.println("enter the elements of first matrix : ");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr[i][j]= sc.nextInt();
        }
    }
        System.out.println("enter the elements of second matrix : ");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr2[i][j]= sc.nextInt();
        }
    }
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr3[i][j]= arr[i][j]+arr2[i][j];
        }
    }
    System.out.println("the sum of matrices is: ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        System.out.print(arr3[i][j] + " ");
        }
        System.out.println();
      }
    sc.close();
}
}