/**
 * Author: Pauline
 * User: pauli
 * Date: 03/04/2025
 * Time: 09:31
 */

package Package1;

public class Entertainment {
    //Initialise object variables
    String favoriteType;
    int number;

    //Create a constructor with parameters
    public Entertainment(String favoriteType, int number) {
        this.favoriteType = favoriteType;
        this.number = number;
    }

    //Create a method to print out the object's variables
    public void getDetails(){
        System.out.println("My favorite type of entertainment is "+ favoriteType);
        System.out.println("I have watched a total of " + number + " " + favoriteType);
    }


}
