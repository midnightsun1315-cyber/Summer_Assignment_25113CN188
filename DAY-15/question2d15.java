import java.util.Scanner;

public class question2d15 {
    public static void main(String[] args){
    
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
      int first=arr[0];
      for(int j =0;j<num-1;j++){
        arr[j]=arr[j+1];
      }
         arr[num-1]=first;
         System.out.println("the new array is :");
      for(int i=0;i<num;i++){
        System.out.print(arr[i] + " ");
      }
    sc.close();    
}

}   
  