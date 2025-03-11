import java.util.Scanner;

public class BudgetTrackerPlus{
    public static void main ( String[]args){
        //Declaration and initialisation of the scanner object
        Scanner scanner = new Scanner ( System.in);

     // Declaration of variables
        int monthlyIncome;
        double rent,groceries,transportation,entertainment;
        double remainingBudget;
        double totalExpenses;
        double totalExpensesPercentage;

       //Taking user input for monthly income
       System.out.println("Enter monthly income: ");
       monthlyIncome = scanner.nextInt();

       //Taking user input for various expenses
        System.out.println("Enter rent: ");
        rent = scanner.nextDouble();
        System.out.println("Enter groceries: ");
        groceries = scanner.nextDouble();
        System.out.println("Enter transportation: ");
        transportation = scanner.nextDouble();
        System.out.println("Enter entertainment: ");
        entertainment = scanner.nextDouble();

        //Calculating total expenses
        totalExpenses = rent + groceries + transportation + entertainment;
        System.out.println("Your total expenses amount is: " + totalExpenses);

        //Calculating the remaining budget
        remainingBudget = monthlyIncome -totalExpenses;
        System.out.println("Your remaining budget is: " + remainingBudget);

        //Calculating the percentage of income spent on each category
        totalExpensesPercentage =totalExpenses / monthlyIncome * 100;
        System.out.println("Total expenses percentage is : " + totalExpensesPercentage + "%");

        scanner.close();


    }
}