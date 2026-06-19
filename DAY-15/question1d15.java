import java.util.Scanner;

public class question1d15 {
        public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num];
      System.out.println("enter the elements : ");
      for(int i=0;i<num;i++){
        arr[i]= sc.nextInt();

      }
      int a=0;
      int b=num-1;
       System.out.println("the reversed array is : " );
      while(a<b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
        a++;
        b--;
      }
      for(int i=0;i<num;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    sc.close();    
}
}