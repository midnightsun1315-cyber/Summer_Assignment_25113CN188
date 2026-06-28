import java.util.Scanner;
public class question4d27 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the name of the student");
    String name = sc.nextLine();
        System.out.println("enter the roll number of the student");
    int rollNO = sc.nextInt();
        String[] subject = {
            "English",
            "Maths",
        "Physics",
          "Chemistry",
          "Computer"
        };
        
          
        int[] marks = new int[5];
        for(int i=0; i<subject.length;i++){
            System.out.println("enter the marks of " + subject[i] + " :");
            marks[i]=sc.nextInt();
             }
             int total=0;
             
              for(int i=0; i<marks.length;i++){
                total+=marks[i];
            
             }
             double per = total/5.0;
             String grade=" ";
             if(per>=90){
                 grade = "A";
             }
            else if(per<90 && per>=80){
                 grade = "B";
             }
            else if(per<80 && per>=70){
                grade = "C";
             }
            else if(per<70 && per>=60){
                 grade = "D";
             }
            else{
                 grade = "F";
             }

             boolean flag = true;
             for(int i =0; i<5;i++){
                if(marks[i] < 33){
                    flag =false;
                    break;
                }
             
            }
             System.out.println("--------------MARKSHEET--------------");
             System.out.println("Name          : "+name);
             System.out.println("Roll NO        : "+rollNO);
           for(int i=0; i<subject.length;i++){
            System.out.println(subject[i] + "          : " + marks[i]);
            
             }
             System.out.println("Total          : "+ total);
             System.out.println("Percentage          : "+ per);
             System.out.println("Grade          : "+ grade);
             if(flag==false){
                System.out.println("Result          : FAIL");
             }
             else{
                System.out.println("Result          : PASS");
             }
             System.out.println("------------------------------------------");
             sc.close();
    
}
}