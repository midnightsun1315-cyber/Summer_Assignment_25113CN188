import java.util.Scanner;

public class question1d17 {
    public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the size of first array");
       int num1= sc.nextInt();
      int[] arr1=new int[num1];
      System.out.println("enter the elements :");
      for(int i=0;i<num1;i++){
        arr1[i]=sc.nextInt();
      }
       System.out.println("enter the size of second array");
       int num2= sc.nextInt();
      int[] arr2=new int[num2];
      System.out.println("enter the elements :");
      for(int j=0;j<num2;j++){
        arr2[j]=sc.nextInt();
      }
      int num3=num1 + num2;
      int[] arr3=new int[num3];
      System.arraycopy(arr1, 0, arr3, 0, num1);
      System.arraycopy(arr2, 0, arr3, num1, num2);
      System.out.println("the merged array is : ");
      
          for(int i=0;i<num3;i++){
            System.out.print(arr3[i] + " ");
          }
          sc.close();
      }

    }
    
    

