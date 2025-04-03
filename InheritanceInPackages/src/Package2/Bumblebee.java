/**
 * Author: Pauline
 * User: pauli
 * Date: 03/04/2025
 * Time: 09:32
 */

package Package2;

public class Bumblebee extends Transformers{
    //Initialise object variables
    String personalityType;

    //Create a constructor with parameters
    public Bumblebee(String personalityType,String name, String favoriteActor,String favoriteType,int number,String movieName){
        super(name,favoriteActor,favoriteType,number,movieName);
        this.personalityType = personalityType;
    }

    //Create a method that overrides and prints out the object's variables
    public void getDetails(){
        super.getDetails();
        System.out.println(favoriteActor+" is " +personalityType);
    }
}
