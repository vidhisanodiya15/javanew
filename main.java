public class main{
    public static void main(String[] args){
        // for (int i=0; i<10 ;i++){
        //     if(i==4){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // for(int i =0; i<10;i++){
        //     if(i==4){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
            if(i==4){
                break;
            }
        }
    }
}