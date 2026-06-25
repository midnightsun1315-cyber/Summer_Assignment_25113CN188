import java.util.Scanner;

public class question3d25 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number of the people");
         int num= sc.nextInt();
       String[] name = new String[num];
       System.out.println("enter the names : ");
        for(int i=0;i<name.length;i++){
        name[i]= sc.next();
   }
     for(int i=0;i<num-1;i++){
        for(int j=0;j<num-1;j++){
         if(  name[j].compareTo(name[j+1]) >0 ){
            String temp =name[j];
            name[j]=name[j+1];
            name[j+1]=temp;

         }
        }
    }
         System.out.println(" names in alphabatical order: ");
       for(int k=0;k<num;k++){
        System.out.println(name[k] + " ");
       }
    
   sc.close();
}
}