import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public  static void main(String args[]) throws IOException {
        String data="Sushant ECE bmsit 164";
       try{
           FileWriter output=new FileWriter("c:\\data\\data1.txt");
           output.write(data);
           System.out.println("data is written sucessfully...");
           output.close();
       }
       catch(IOException e){
           System.out.println("we found some bug..");
        }
    }
}
