import java.util.Scanner;
public class question4d17 {
    public static void main(String[] args) {
        
    
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
      System.out.println("the common elements are");
         for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
         }

          sc.close();
      }

    }
 

