import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        //Make the console refer to the user as Paula if their name is Paula
        Scanner scanner = new Scanner(System.in);
        String firstName;
        int age;
        String color;

        System.out.println("Enter your first name");
        firstName = scanner.nextLine();

        if(firstName.equals("Paula")) {
            System.out.println("Hi Paula. My name is Paula too!");
        }else {
            System.out.println("Hi " + firstName);
        }
            //Make 2 if statements (Nested If statements)
            System.out.println("How old are you?");
            age = scanner.nextInt();

             scanner.nextLine();

            System.out.println("What color do you like?");
            color =scanner.nextLine();
            if (age <=17){
                if (color.equalsIgnoreCase("blue")) {
                    System.out.println("You are not eligible for purchase of this product");
                }else {
                    System.out.println("Thank you for purchasing our product.");
                }
            }
        scanner.close();
        }
    }

