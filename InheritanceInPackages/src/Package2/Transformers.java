/**
 * Author: Pauline
 * User: pauli
 * Date: 03/04/2025
 * Time: 09:31
 */

package Package2;
//import package1 to be able to inherit from it
import Package1.Movies;

public class Transformers extends Movies{
    //Initialise object variables
    String name;
    String favoriteActor;

    //Create a constructor with parameters
    public Transformers(String name, String favoriteActor,String favoriteType,int number,String movieName) {
        super(favoriteType,number,movieName);
        this.name = name;
        this.favoriteActor = favoriteActor;
    }

    //Create a method that overrides and prints out the object's variables
    public void getDetails(){
        super.getDetails();
        System.out.println("My favorite movie is "+name+ ". I love " + favoriteActor);
    }
}
