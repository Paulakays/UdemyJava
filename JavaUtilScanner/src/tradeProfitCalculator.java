import java.util.Scanner;

public class tradeProfitCalculator {
    public static void main (String[]args){
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the cost price and selling price
        System.out.println("Enter the cost price of the item:");
        double costPrice = scanner.nextDouble();

        System.out.println("Enter the selling price of the item:");
        double sellingPrice = scanner.nextDouble();

        // Calculate the profit or loss
        double result = costPrice - sellingPrice;

        // Display the result with relational operators
        boolean profitLossResult  = result >= costPrice;
        System.out.println("You made a profit (true or false)");
        System.out.println(profitLossResult);

        // Demonstrate unary operators
        double unary = -result;
        System.out.println(unary);

        // Demonstrate compound operators
        int tradeItems = 12;
        tradeItems +=23;
        System.out.println(tradeItems);
        // Use the modulo operator
        int tradeItemsNotSold = 34;
        int tradeItemsSold =24;
        int modulo= tradeItemsNotSold % tradeItemsSold;
        System.out.println(modulo);
    }
}