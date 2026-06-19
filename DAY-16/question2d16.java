import java.util.Scanner;

public class question2d16 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array : ");
      int num = sc.nextInt();
      int[] arr=new int[num-1];
      System.out.println("enter the elements : ");
      for(int i=0;i<arr.length;i++){
        arr[i]= sc.nextInt();

      }
        int maxCount=0;
        int maxElement=arr[0];
      for(int j=0;j<arr.length;j++){
       int currentElement=arr[0];
       int currentCount=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]==currentElement){
                currentCount++;
            }
        }
        if(currentCount>maxCount){
            maxCount=currentCount;
            maxElement=currentElement;

        }
      }
      System.out.println("maximum frequency element is : " + maxElement);
    sc.close();    
}
    }
    

