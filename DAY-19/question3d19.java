import java.util.Scanner;

public class question3d19 {
        public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows : ");
      int row = sc.nextInt();
    System.out.println("enter the column : ");
      int col = sc.nextInt();
       int[][] arr=new int[row][col];
        System.out.println("enter the elements of matrix : ");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr[i][j]= sc.nextInt();
        }
    }
     System.out.println("the trsanpose of matrix is: ");
    for(int i=0;i<col;i++){
        for(int j=0;j<row;j++){
        System.out.print(arr[j][i] + " ");
        }
        System.out.println();
      }
      sc.close();
}
}