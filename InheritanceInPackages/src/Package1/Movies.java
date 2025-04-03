/**
 * Author: Pauline
 * User: pauli
 * Date: 03/04/2025
 * Time: 09:31
 */

package Package1;

//Inherits the object Entertainment
public class Movies extends Entertainment{
    //Initialise object variables
    String movieName;

    //Use a protected instance to enable access within it's class and subclasses
    protected Movies(String favoriteType,int number,String movieName) {
        super(favoriteType,number);
        this.movieName = movieName;
    }

    //Create a method that overrides and prints out the object's variables
    public void getDetails() {
        super.getDetails();
        System.out.println("My favorite movie is " + movieName);
    }
}
