class A{
    static int x=20;
    int y=30;
    private static int z=30;
    static class B{
        void get(){
            System.out.println("x : "+x);
            System.out.println("z : "+z);
        }
    }
}
public class FirstProgram{
    public static void main(String[] args) {
        A.B obj=new A.B();
        obj.get();
    }
}