import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(5);
        //System.out.println(ch)
        if(ch >='a' && ch<= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
    
}
