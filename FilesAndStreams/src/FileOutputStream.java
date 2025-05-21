import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) {
        String data = "This is my file";

        //Use file output stream to create a file
        try(java.io.FileOutputStream fos = new java.io.FileOutputStream("src/newFile.txt")) {

            byte[] bytesArray = data.getBytes();
            fos.write(bytesArray);

            /*
            Flushes the output stream and forces any buffered output bytes to be written out
            The buffering is mainly done to improve the I/O performance
             */
            fos.flush();

            System.out.println("Data written to file");

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

        }

    }

