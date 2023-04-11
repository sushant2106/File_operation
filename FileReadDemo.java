import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReadDemo {
    public static void main(String args[]) throws IOException {
        char data[]=new char[100];
       try{
           FileReader input=new FileReader("c:\\data\\data1.txt");
           input.read(data);
           System.out.println("data is recived from file");
           System.out.println(data);
           input.close();
       }
//       catch (FileNotFoundException e){
//           System.out.println("File not found....");
//       }
       catch(IOException e){
           System.out.println("File read error...");
       }
    }
}
