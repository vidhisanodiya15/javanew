public class FirstProgram2 {
    private int data=20;
    void display(){
        class local{
            void msg(){
                System.out.println(data);
            }
            local r=new local();
            r.msg();
        }
    }
    public static void main(String[] args) {
        FirstProgram2 obj=new FirstProgram2();
        obj.display();
    }
}
