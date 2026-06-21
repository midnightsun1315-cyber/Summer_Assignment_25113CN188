import java.util.Scanner;

public class question4d19 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows : ");
      int row = sc.nextInt();
    System.out.println("enter the columns : ");
      int col = sc.nextInt();
       int[][] arr=new int[row][col];
        System.out.println("enter the elements of matrix : ");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr[i][j]= sc.nextInt();
        }
    }
    int sum=0;
    
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(i==j){
        sum+=arr[i][j];
        }
    }
}
       System.out.println("the sum of diagonal elements of matrix is: " + sum);  
      
      sc.close();
}
}
    

