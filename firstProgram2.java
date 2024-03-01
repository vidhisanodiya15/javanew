interface Program{
    void execute();

}
interface Program1{
    void run();
}
public class firstProgram2 implements Program, Program1{
    public void execute(){
        System.out.println("program from class zu");
    }
    public void run(){
        System.out.println("vidhi and siddhi are from zu");
    }
    public static void main(String[] args) {
        firstProgram2 r=new firstProgram2();
        r.execute();
        r.run();
    }
}