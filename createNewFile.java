import java.io.File;
import java.io.*;
import java.util.*;
public class File_1 {
    public static  void main(String args[]) throws IOException {
        File myFile=new File("data.txt");
        if(myFile.createNewFile()){
            System.out.println("file created..");
        }
    }
}
