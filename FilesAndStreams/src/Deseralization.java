
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Deseralization {

        public static void main(String [] args) {
            Employeee e = null;
            try {
                FileInputStream fileIn = new FileInputStream("employee.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                //Cast the employeee to read the employeee as an object and not as data
                e = (Employeee) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException i) {
                i.printStackTrace();
                return;
            } catch (ClassNotFoundException c) {
                System.out.println("Employee class not found");
                c.printStackTrace();
                return;
            }

            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + e.name);
            System.out.println("Address: " + e.address);
            System.out.println("SSN: " + e.SSN);
            System.out.println("Number: " + e.number);
        }
    }
    class Employeee implements java.io.Serializable {

        private static final long serialVersionUID = 1L;
        public String name;
        public String address;
        public transient int SSN;
        public int number;

        public void mailCheck() {
            System.out.println("Mailing a check to " + name + " " + address);
        }
    }

