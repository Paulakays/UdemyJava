public class Main {
    public static void main (String[]args){
        //initialise a Lambda expression using a created object from the Calculator interface
        Calculator addition = (int a, int b) -> a+b;
        int sum = addition.calculate(10,5);
        System.out.println("Addition: " + sum);

        Calculator subtraction = (int a, int b) -> a-b;
        int difference = subtraction.calculate(10,5);
        System.out.println("Subtraction: " + difference);


        Greeting greet = (name) -> System.out.println("Hello " + name);
        greet.sayHello("Alice");

        MathOperation add = (x, y) -> x+y;
        int sum2 = executeOperation(10,5,add);
        System.out.println("Sum is: " + sum2);

        performLogging(message -> System.out.println("Console log: " + message));


    }
    //Method for the interface MathOperation
    //Has to be static to be able to be accessed in the static main method
    public static int executeOperation(int a,int b, MathOperation operation){
        return operation.operate(a,b);
    }
    //Method for the interface Logger
    public static void performLogging(Logger logger){
        String message = " This is a logging message";
        logger.log(message);
    }
}
