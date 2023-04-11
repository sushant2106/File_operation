import java.io.*;

public class FileAppendDemo {
    public static void main(String args[]) throws IOException{
            String data="this data is appended";
           try{
               FileWriter output=new FileWriter("c:\\data\\data1.txt",true);
               output.write(data);
               System.out.println("Succesfully appneded the data into file..");
               output.close();
           }
           catch (IOException e){
               System.out.println("IoException......");
           }
    }
}
