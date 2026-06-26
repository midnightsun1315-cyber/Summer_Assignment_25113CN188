import java.util.Scanner;
public class question4d26 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    String[] questions = {
       "Q1. What is the capital of India?\nA. Mumbai\nB. Delhi\nC. Kolkata\nD. Chennai",

     "Q2. Which keyword is used to create an object in Java?\nA. class\nB. object\nC. new\nD. create",

    "Q3. Which planet is known as the Red Planet?\nA. Earth\nB. Mars\nC. Jupiter\nD. Venus",

    "Q4. How many days are there in a leap year?\nA. 365\nB. 364\nC. 366\nD. 367",

    "Q5. Which data type stores whole numbers in Java?\nA. double\nB. float\nC. int\nD. char",

    "Q6. Which loop is guaranteed to execute at least once?\nA. for\nB. while\nC. do-while\nD. foreach",

    "Q7. What is 15 x 8?\nA. 110\nB. 120\nC. 130\nD. 140",

    "Q8. Which company developed Java?\nA. Microsoft\nB. Apple\nC. Sun Microsystems\nD. Google",

    "Q9. Which operator is used for comparison in Java?\nA. =\nB. ==\nC. +=\nD. &&",

    "Q10. Which keyword is used to stop a loop?\nA. continue\nB. stop\nC. break\nD. exit"
};

char[] answers = {'B','C','B','C','C','C','B','C','B','C'};
int score =0;
for(int i=0;i<questions.length;i++){
    System.out.println(questions[i]);
    char input = Character.toUpperCase(sc.next().charAt(0));
    if(input == answers[i]){
        score++;
    }
}
System.out.println("Score : " + score + "/10");
System.out.println("wrong answers : " + (10-score));
System.out.println("percentage : " + (score*10) + "%");
  sc.close();
}
}