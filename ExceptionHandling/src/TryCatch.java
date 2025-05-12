import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
           int firstNumber = scanner.nextInt();
           int secondNumber = scanner.nextInt();
           int result = firstNumber / secondNumber;
           System.out.println("The result is: " + result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}