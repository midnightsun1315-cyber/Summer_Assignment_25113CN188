import java.util.Scanner;
public class question1d25 {
 public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the size of the first array");
  int num= sc.nextInt();
  int[] arr = new int[num];
   System.out.println("enter the elements of the first array");
   for(int i=0;i<arr.length;i++){
    arr[i]= sc.nextInt();
   }
   System.out.println("enter the size of the second array");
  int num2= sc.nextInt();
  int[] arr2 = new int[num2];
   System.out.println("enter the elements of the second array");
   for(int i=0;i<arr2.length;i++){
    arr2[i]= sc.nextInt();
   }
    int[] arr3 = new int[num + num2]   ;

    int i=0;
    int j=0;
    int k=0;
    while(i< arr.length && j< arr2.length ){
        if(arr[i]<arr2[j]){
            arr3[k]=arr[i];
            i++;
        }
        else{
            arr3[k]=arr2[j];
            j++;
        }
        k++;
    }
     while(i< arr.length ){
            arr3[k]=arr[i];
            i++;
            k++;
        }
     while(j< arr2.length ){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
    for(int m=0;m<num+num2;m++){
        System.out.print(arr3[m] + " ");
       }
       sc.close();
}
}