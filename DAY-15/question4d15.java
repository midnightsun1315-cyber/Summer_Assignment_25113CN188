import java.util.Scanner;

public class question4d15 {
    public static void main(String[] args){
    
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
      int m=0;
      for(int j =0;j<num;j++){
       if(arr[j]!=0){
        int temp =arr[j];
        arr[j]=arr[m];
        arr[m]=temp;

        m++;
       }
      }
        System.out.println("the new array is :");
      for(int i=0;i<num;i++){
        System.out.print(arr[i] + " ");
      }
    sc.close();    
}
}
