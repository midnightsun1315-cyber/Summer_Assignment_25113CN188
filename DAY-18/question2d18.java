import java.util.Scanner;
public class question2d18 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();
        }
        
        for(int i=0;i<num-1;i++){
                int a= i;
            for(int j=i+1;j<num;j++){
            
                if(arr[a]>arr[j]){
                a = j;
                
            }

        }
           int temp= arr[a];
          arr[a] =arr[i];
          arr[i]=temp;
    }
                  System.out.println(" sorted array is: ");
       for(int k=0;k<num;k++){
        System.out.print(arr[k] + " ");
       }
       sc.close();
    }
}
