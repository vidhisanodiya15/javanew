public class Main {
    static void checkAge(int age)throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("access denied- you must be atleast 18 years old");
        
        }else{
            System.out.println("access granted you are old enough!");
        }
}
public static void main(String[] args){
    checkAge(25);
}
    
}
