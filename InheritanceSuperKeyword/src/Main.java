/**
 * Author: Pauline
 * User: pauli
 * Date: 02/04/2025
 * Time: 11:23
 */

public class Main {
    public static void main (String[] args){
        //Create one Car object and one Bike object.
       Car car = new Car(230,"Premium gas ","Audi");
       Bike bike = new Bike(130,4);

       //Call displayInfo() for both objects to show polymorphism.
        car.displayInfo();
       bike.displayInfo();
    }
}



