import java.util.Scanner;
public class question1d16 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num-1];
      System.out.println("enter the elements : ");
      for(int i=0;i<arr.length;i++){
        arr[i]= sc.nextInt();

      }
        int sum1= num*(num+1)/2;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
      System.out.println("the missing number is : " + (sum1-sum));
    sc.close();    
}
}
   