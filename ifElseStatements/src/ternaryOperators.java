import java.util.Scanner;

public class ternaryOperators {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        //condition ? expression1 : expression2;
        //assign variables
        int score;
        char totalGrade;
        //Prompt user to enter their score
        System.out.println("Enter your score in mathematics");
        score = scanner.nextInt();
        //Compare score
        totalGrade = (score >= 100) ? 'A' : (score >= 90) ? 'B'
                : (score >= 80) ? 'C' : (score >= 70) ? 'D' :
                (score >= 60) ? 'E' : (score >= 50) ? 'E' : 'F';
        //Print out total grade
        System.out.println("Your total grade is " + totalGrade);
    }
}
