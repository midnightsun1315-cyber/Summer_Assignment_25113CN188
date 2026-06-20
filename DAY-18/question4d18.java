import java.util.Scanner;
public class question4d18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();
        }
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         System.out.println(" sorted array is: ");
       for(int k=0;k<num;k++){
        System.out.print(arr[k] + " ");
       }
       sc.close();
    }
}