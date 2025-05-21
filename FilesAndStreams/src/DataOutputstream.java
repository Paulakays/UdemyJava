import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputstream {
    public static void main(String[] args) {
        String data = "This is my file";

        //Use file output stream to create a file
        try(FileOutputStream fos = new FileOutputStream("src/output.bin");
        DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeInt(14);
            dos.writeChar('c');
            dos.writeUTF("Happy coding");
            dos.writeFloat(13678);

            /*
            Flushes the output stream and forces any buffered output bytes to be written out
            The buffering is mainly done to improve the I/O performance
             */
            dos.flush();

            System.out.println("Data written to file");

        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
