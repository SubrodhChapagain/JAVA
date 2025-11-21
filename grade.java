import java.util.Scanner;

public class grade
{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER GRADE");
        double g = input.nextDouble();
        
        String c = (g>=40)? "PASS":"FAIL";
        System.out.println(c);
    
    
    
    }
}