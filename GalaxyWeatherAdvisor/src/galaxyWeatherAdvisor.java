import java.util.Scanner;

public class galaxyWeatherAdvisor {
    public  static void main (String[]args){
       Scanner scanner = new Scanner(System.in);

       //Display a welcome message
        System.out.println("Welcome to the Galactic Weather Advisor!");
        System.out.println("Please enter the planet you are on (Earth, Mars, Venus, Jupiter):");

        //Take user input for planet and convert to lowercase
        String planet = scanner.nextLine().trim().toLowerCase();

        //Take current temperature input
        System.out.println("Please enter the current temperature in celcius:");
        double temperature = scanner.nextDouble();

        //Compute response based on planet and temperature and display response
        if (temperature <10){
            System.out.println("It's extremely cold on " + planet + "! Wear a space suit with thermal insulation.");
        }else if (temperature >100){
            System.out.println("It's scorching hot on " + planet + ". Avoid going outside!");
        } else if (temperature>=10 && temperature<=99){
            System.out.println("It's quite chilly on " + planet+ ". Wear a jacket");
        }

        scanner.close();
    }
}
