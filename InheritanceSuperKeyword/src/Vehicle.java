/**
 * Author: Pauline
 * User: pauli
 * Date: 02/04/2025
 * Time: 11:29
 */

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    //method displayInfo() that prints the speed.
    public void displayInfo() {
     System.out.println("The vehicles speed is: " + speed);
    }

}

