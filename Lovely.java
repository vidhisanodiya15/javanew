import java.io.FileWriter;
import java.io.IOException;

class Lovely{
public static void main(String[] args)
{
String content = "Hello Welcome to Lovely!";
try{
FileWriter f = new FileWriter("output.txt");
f.write(content);
f.close();

System.out.println("Content is successfully added into the input");
}
catch(IOException e){
System.out.println(e);
}
}
}

    

