import java.util.Scanner;

public class question3d14 {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
        int max1 = Math.max(arr[0],arr[1]);
        int max2 = Math.min(arr[0],arr[1]);
        for(int j=2;j<num;j++){
            if(arr[j]>max1){
                max2=max1;
                max1=arr[j];
                
            }
        else if(arr[j]>max2 && arr[j]!=max1){
            max2=arr[j];
        }
              }
            System.out.println("the second largest element is : " + max2);
      sc.close();
 
        }
    }
    


    

 