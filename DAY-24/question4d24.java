import java.util.Scanner;
public class question4d24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            boolean flag = false;
            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                    flag =true;
                    break;
                }
                
            }
            if(!flag){
                System.out.println(str.charAt(i));
            }
        }
        sc.close();
    }
    
}
