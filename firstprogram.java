abstract class Program{
    abstract void run();

}
public class firstprogram{
    void run(){
        System.out.println("executing properly");
    }
    

public  static void  main(String[] args){
    firstprogram r=new firstprogram();
    r.run();
}
}