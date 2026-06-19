import java.util.Scanner;
import java.util.Arrays;
public class question3d16 {
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num-1];
      System.out.println("enter the elements : ");
      for(int i=0;i<arr.length;i++){
        arr[i]= sc.nextInt();

      }
      System.out.println("enter the sum : ");
      int target= sc.nextInt();
       Arrays.sort(arr);
      int left =0;
      int right =arr.length -1;
       while(left<right){
        int currentSum=arr[left] +arr[right];
        if(currentSum == target){
            System.out.print("pair found: " + arr[left] + " and " + arr[right]);
            break;
        }
        else if(currentSum< target){
            left++;
        }
        else if(currentSum>target){
            right--;
        }
       }
       sc.close();
    }
    
}
