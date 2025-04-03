/**
 * Author: Pauline
 * User: pauli
 * Date: 02/04/2025
 * Time: 12:14
 */
//subclass  that inherits from Vehicle
public class Bike extends Vehicle {
    //Initialise variables
    int gearCount;

    public Bike(int speed,int gearCount) {
        //initialise the superclass
        super(speed);
        this.gearCount = gearCount;
    }

    //Overrides displayInfo() to also print the gearCount.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The gear count is: " + gearCount);
    }
}
