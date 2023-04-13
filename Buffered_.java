import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
	   String str[]={"ram","shyam","ghanshyam"};
	   
	   try{
	       BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
	       writer.write("Write to first Line...");
	       writer.write("\nWrite in 2nd Line....");
	       for(String name:str){
	           writer.write("\n"+name);
	       }
	       writer.close();
	   }
	   catch(IOException e){
	       e.printStackTrace();
	   }
	   try{
	       BufferedReader reader=new BufferedReader(new FileReader("output.txt"));
           String line;
           while((line=reader.readLine())!=null){
               System.out.println(line);
           }
           reader.close();
	   }
	   catch(IOException e){
	       e.printStackTrace();
	   }
	   
	    
	    
	}
}
