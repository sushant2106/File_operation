import java.io.File;

public class DeleteFileDemo {
    public static void main(String args[]){
            File myFile=new File("c:\\data\\data2.txt");
           try{
               if(myFile.delete()){
                   System.out.println("file got deleted..."+myFile.getName());
               }
               else{
                   System.out.println("failed to delete..");
               }

           }
           catch(Exception e){
               System.out.println(e);
           }
    }
}
