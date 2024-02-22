class zu{
    int rollno=56;
    String name="Vidhi";
    void getValues(){
        System.out.println("Name=" + name + "Rollno=" + rollno);
    }
}
public class FirstProgram extends zu{
    public static void main(String[] args){
        FirstProgram r=new FirstProgram();
        r.getValues();
    }
}