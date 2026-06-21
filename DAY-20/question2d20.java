import java.util.Scanner;
public class question2d20 {
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
         boolean flag = true;
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(arr[i][j]!=arr[j][i]){
                flag = false ;
                break;
            }
       
        }
    }
    if(flag==true){
    System.out.println("the matrix is symmetric");
    }else{
        System.out.println("the matrix is not symmetric");
    }
    sc.close();
}
}
