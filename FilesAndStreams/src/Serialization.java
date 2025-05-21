import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*Serializable is an interface that gives us the information that we can transform our object into some text and
later deserialize so we can convert this text into an object again.
This is Java's native way of writing object state to a wire or storage format (for sending over the network or writing to disk, respectively).
 */
public class Serialization {

        public static void main(String [] args) {
            Employeee e = new Employeee();
            e.name = "Reyan Ali";
            e.address = "Phokka Kuan, Ambehta Peer";
            e.SSN = 11122333;
            e.number = 101;

            try {
                //When serializing an object to a file, the standard convention in Java is to give the file a .ser extension.
                FileOutputStream fileOut = new FileOutputStream("employee.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(e);
                out.close();
                fileOut.close();
                System.out.printf("Serialized data is saved in /tmp/employee.ser");
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
    }

    //The class must implement the java.io.Serializable interface.
    class Employee implements java.io.Serializable {
        private static final long serialVersionUID = 1L;
        public String name;
        public String address;
        //All of the fields in the class must be serializable. If a field is not serializable, it must be marked transient.
        public transient int SSN;
        public int number;

        public void mailCheck() {
            System.out.println("Mailing a check to " + name + " " + address);
        }
    }

