import java.util.Scanner;

public class switchWithinSwitch {
    public static void main (String[]args){
        Scanner scanner = new Scanner ( System.in);
        String toDo;
        String furtherToDo;
        System.out.println("What would you choose to do for the next ten years");
        System.out.println("Please choose among these; study,relax,work,do outdoor activities");
        toDo = scanner.nextLine();

        switch (toDo){
            case "study":
              System.out.println("Wow! you must be very bright!");
              break;
              case "relax":
                  System.out.println("Me too!");
                  break;
                  case "work":
                      System.out.println("I beg your pardon?");
                      break;
                      case "do outdoor activities":
                          System.out.println("Which outdoor activities would you like to do?");
                          System.out.println("Please choose among these; swimming,hiking,barbeque");
                          furtherToDo =scanner.nextLine();
                          switch (furtherToDo){
                              case "barbeque":
                                  System.out.println("Mmmh...I can smell roasted meat already");
                                  break;
                                  case "swimming":
                                      System.out.println("So you're a fish huh?");
                                      break;
                                      case "hiking":
                                          System.out.println("Seems like fun to me!");
                                          break;
                                          default:
                                              System.out.println("Something went wrong");
                                              break;
                          }
        }
    }
}
