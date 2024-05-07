import java.io.FileWriter;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) {
//         File myFile = new File("file1.txt");
//         myFile.createNewFile();
//     }
    
// }
// try{
//     FileWriter 
try{
    FileWriter fileWriter=new FileWriter("file1.txt");
    fileWriter.write  ("this a java file\n this is not a java file");
    fileWriter.close();

}catch(IOException e){
    e.printStackTrace();
}
}
}

