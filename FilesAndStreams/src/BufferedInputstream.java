import java.io.BufferedInputStream;
import java.io.InputStream;

public class BufferedInputstream {
    public static void main (String[]args){

        InputStream in = BufferedInputstream.class.getClassLoader().getResourceAsStream("newFile.txt");

        if(in == null){
            System.out.println("File not found");
            return;
        }
        try(BufferedInputStream bis = new BufferedInputStream(in)){
            int data;
            //A while loop to loop through all the data that is to be read as long as there's data
            while((data = bis.read()) !=-1){
                System.out.print((char)data);
            }

        }

        catch(Exception e){
            throw new RuntimeException();
        }
    }
}
