import java.util.Scanner;
import java.util.Arrays;
public class question3d18 {
        public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();
        }
        System.out.println("enter the element you want to find");
        int key= sc.nextInt();
        Arrays.sort(arr);
        int low =0;
        int high =num-1;
        int flag=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                flag=mid;
                break;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
        }
        if(flag== 0){
        System.out.println("key not found " );
        }
        else{
            System.out.println("key is found at place : " + (flag+1));
        }
        sc.close();
}
}