import java.util.Scanner;

public class BibleStudyDays{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, here we will calculate the number of days you participated in bible study");
        String monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        int howLong;
        System.out.println("Did you attend bible study on monday?");
        monday= scanner.nextLine();
        System.out.println("How long did you take on this day?");
        howLong =scanner. nextInt();
        scanner.nextLine();
        System.out.println("Did you attend bible study on tuesday?");
        tuesday= scanner.nextLine();
        System.out.println("How many minutes did you take on this day?");
        howLong =scanner. nextInt();
        scanner.nextLine();
        System.out.println("Did you attend bible study on wednesday?");
        wednesday= scanner.nextLine();
        System.out.println("How many minutes did you take on this day?");
        howLong =scanner. nextInt();
        scanner.nextLine();
        System.out.println("Did you attend bible study on thursday?");
        thursday= scanner.nextLine();
        System.out.println("How many minutes did you take on this day?");
        howLong =scanner. nextInt();
        scanner.nextLine();
        System.out.println("Did you attend bible study on friday?");
        friday= scanner.nextLine();
        System.out.println("How many minutes did you take on this day?");
        howLong =scanner. nextInt();
        scanner.nextLine();
        System.out.println("Did you attend bible study on saturday?");
        saturday= scanner.nextLine();
        System.out.println("How many minutes did you take on this day?");
        howLong =scanner. nextInt();
        scanner.nextLine();
        System.out.println("Did you attend bible study on sunday?");
        sunday= scanner.nextLine();
        System.out.println("How many minutes did you take on this day?");
        howLong =scanner. nextInt();
        scanner.nextLine();
        scanner.close();

    }
}