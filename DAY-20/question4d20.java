import java.util.Scanner;
public class question4d20 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows : ");
      int row = sc.nextInt();
    System.out.println("enter the column : ");
      int col = sc.nextInt();
       int[][] arr=new int[row][col];
       if(row!=col){
        System.out.println("not symmetric");
       }
      
        System.out.println("enter the elements of matrix : ");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr[i][j]= sc.nextInt();
        }
    }
   
      for(int i=0;i<row;i++){
        int sum =0;
        for(int j=0;j<col;j++){
           sum +=arr[j][i];
            }
       System.out.println("the sum of col " + (i+1) + " is : " + sum);
        }
    
   
    sc.close();
}
}
