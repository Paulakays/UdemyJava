/**
 * Author: Pauline
 * User: pauli
 * Date: 02/04/2025
 * Time: 11:47
 */
//subclass  that inherits from Vehicle
public class Car extends Vehicle {
    //Initialise variables
    String fuelType;
    String carName;

    //Create an object that stores the variables
    public Car(int speed,String fuelType, String carName) {
        //initialise the superclass
        super(speed);
        this.fuelType = fuelType;
        this.carName = carName;
    }

    //Overrides displayInfo() to also print the fuelType and carName
    @Override
    public void displayInfo(){
        //Calls the superclass method
        super.displayInfo();
        System.out.println("The vehicles Fuel Type is: " + fuelType);
        System.out.println("The vehicles Car Name is: " + carName);
    }

}
