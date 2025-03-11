import java.util.Scanner;

public class switchStatements {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
       /* switch (expression/variable) {
            case value1:
                break;
            case value2:
            //breaks stop the compiler from going on through the cases but jump right to the final statement
            //without a break, the compiler will go through all cases
                break;
            default:
        }
        switch statements cannot perform comparisons like if.. else statements
       */
        System.out.println("Enter your score in mathematics : ");
        int score= scanner.nextInt();
        char totalGrade;


        switch (score/10 ){
                case 10:
                    totalGrade= 'A';
                    System.out.println("Your score is " + totalGrade);
                    break;
                case 9:
                    totalGrade = 'B';
                    System.out.println("Your score is " + totalGrade);
                    break;
                case 8:
                    totalGrade = 'C';
                    System.out.println("Your score is " + totalGrade);
                    break;
                case 7:
                    totalGrade = 'D';
                    System.out.println("Your score is " + totalGrade);
                    break;
                case 6:
                    totalGrade = 'E';
                    System.out.println("Your score is " + totalGrade);
                    break;
                case 5:
                    totalGrade = 'F';
                    System.out.println("Your score is " + totalGrade);
                    break;
                default:
                    System.out.println("Invalid score");
                    break;
        }
        scanner.close();
    }
}
