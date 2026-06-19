import java.util.Scanner;
import java.util.Arrays;
public class question4d16 {
     public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num-1];
      System.out.println("enter the elements : ");
      for(int i=0;i<arr.length;i++){
        arr[i]= sc.nextInt();

      }
     

       Arrays.sort(arr);
       int j=0;
       for(int i=1; i<arr.length;i++){
        if(arr[i] != arr[j]){
            j++;
            arr[j]=arr[i];
        }
       }
       System.out.println(" new array is: ");
       for(int k=0;k<=j;k++){
        System.out.print(arr[k] + " ");
       }
    sc.close();
}
}