class zu{
    int rollno=34;
    String name="vidhi";
    void getValues(){
        System.out.println("Name" +name+"rollno"+rollno);
    }

}
public class FirstProgram extends zu{
    int rollno=43;
    String name="dua";
    void getValues(){
        System.out.println("Name" +name+"rollno"+rollno);
    }
    public static void main(String[] args){
        FirstProgram r=new FirstProgram();
        r.getValues();
    }
}