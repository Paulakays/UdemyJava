import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputstream {
    public static void main(String[] args) {
        String data = "This is my file";

        //Use file output stream to create a file
        try (FileOutputStream fos = new FileOutputStream("src/newFile.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            byte[] bytesArray = data.getBytes();
            bos.write(bytesArray);

            /*
            Flushes the output stream and forces any buffered output bytes to be written out
            The buffering is mainly done to improve the I/O performance
             */
            bos.flush();

            System.out.println("Data written to file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
/*


 BOS wraps another output stream - every byte you write to the BOS will eventually be written to the underlying output stream, which could be a FileOutputStream, a ByteArrayOutputStream, or others.

FOS is "standalone" - it writes directly to a file. It doesn't have an underlying output stream.

BOS stores the written bytes in a temporary buffer and flushes it when it is filled up, or when you call the flush method. Flushing simply writes the contents of the buffer to the underlying stream.
This makes it more efficient, instead if writing each byte you only write once you've accumulated enough of them.

FOS on the other hand might have an internal buffering mechanism, but you have no control over it other than the flush method.

In most cases you don't need a BOS. You only need it if writing to the output stream creates a bottleneck.
 */