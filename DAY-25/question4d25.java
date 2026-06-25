import java.util.Scanner;

public class question4d25 {
    public static void main(String[] args) {
        
  Scanner sc = new Scanner(System.in);
         System.out.println("enter the sentence");
        String str= sc.nextLine();
        String[] word= str.split(" ");
         for(int i=0;i<word.length;i++){
        for(int j=0;j<word.length-1;j++){
         if(  word[j].length() > word[j+1].length() ){
            String temp =word[j];
            word[j]=word[j+1];
            word[j+1]=temp;

         }
        }
    }
      System.out.println(" sorted words: ");
       for(int k=0;k<word.length;k++){
        System.out.println(word[k] + " ");
       }
       sc.close();
}
}