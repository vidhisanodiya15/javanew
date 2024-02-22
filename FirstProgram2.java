class zu{
    int rollno=56;
    String name="Vidhi";
    void getValues(){
        System.out.println("Name=" + name + "Rollno=" + rollno);
    }
}
class aman extends zu{
    void getDetails(){
        System.out.println("Function from aman");

    }
}
public class FirstProgram2 extends zu{
    public static void main(String[] args){
        FirstProgram2 r=new FirstProgram2();
        r.getValues();
    }
}