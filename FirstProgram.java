// public class  FirstProgram{
//     void getValues(int a){
//         System.out.println("value of a= "+a);
//     }
//     void getValues(int a,int b){
//         System.out.println("values of a & b="+(a+b));

//     }
//     public static void main(String[] args){
//         FirstProgram abc= new FirstProgram();
//         abc.getValues(27);
//         abc.getValues(28,12);
//     }
// }
public class  FirstProgram{
    void getValues(int a){
        System.out.println("value of a= "+a);
    }
    void getValues(int a,int b,int c){
        System.out.println("values of a & b & c ="+(a+b+c));

    }
    public static void main(String[] args){
        FirstProgram abc= new FirstProgram();
        abc.getValues(27);
        abc.getValues(28,12,34);
    }
}
