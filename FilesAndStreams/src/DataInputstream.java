import java.io.*;

public class DataInputstream {
    public static void main(String[] args) {

        //Create a new InputStream and get the location of the file to be read
        InputStream in = DataInputstream.class.getClassLoader().getResourceAsStream("output.bin");

        //Displayed if the file is not found
        if (in == null) {
            System.out.println("File does not exist!");
        }
        try (DataInputStream dis = new DataInputStream(in)) {
            char charValue = dis.readChar();
            int intValue = dis.readInt();
            String stringValue = dis.readUTF();
            float floatValue = dis.readFloat();


            System.out.println("char: " + charValue);
            System.out.println("int: " + intValue);
            System.out.println("String: " + stringValue);
            System.out.println("float: " + floatValue);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
