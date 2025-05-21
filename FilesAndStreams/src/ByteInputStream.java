import java.io.*;

public class ByteInputStream {
    public static void main(String[] args) {

        byte[] data = {110, 100, 67, 90, 121};

        ByteArrayInputStream inputStream = null;
        try {
            //Getting the input stream data
            inputStream = new ByteArrayInputStream(data);
            int byteData;
            //Reading from the input stream while also checking if there's data
            while ((byteData = inputStream.read()) != -1) {
                //While loop is stopped once there's no data. The result is converted to characters since they are initially in int form
                System.out.print((char) byteData);
            }
        } catch (Exception e) {
            System.out.println("Error during inputstream");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}

