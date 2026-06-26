import java.util.Scanner;

public class question1d26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secret = (int) (Math.random()*100) +1;
        System.out.println("WELCOME TO THE GAME");
        System.out.println("TRY to guess the number between 1 to 100");
      
        int count =0;
     
        while(true){
              int guess = sc.nextInt();
              count ++;
            if(guess == secret){
             System.out.println("CORRECT ! you guessed the number in  " + count + "attempts");
             break;
            }
           
           
           else if(guess>secret){
                System.out.println("number is too high");
            }
            else{
                System.out.println("number is too low");
            }
        }
            
        
        sc.close();
    }
    
}
