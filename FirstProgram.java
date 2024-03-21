public class FirstProgram{
    public static void main(String[] args){
        try{
            int arr[]={1,2,3,5};
            System.out.println(arr[10]);
            
        }catch(ArrayIndexOutOfBoxException e){
            System.out.println("ArrayIndexOutOfBoxException");
        }finally{
            System.out.println("finally block");
        }
    }
}