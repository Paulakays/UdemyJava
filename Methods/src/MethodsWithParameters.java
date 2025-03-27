public class MethodsWithParameters {
    public static void main(String[] args) {
        /*
        The parameters have to be included because they're in another method which
        can't access them.
         */
        sayHello("Paula",20);

    }
    /*
    The method has to be static to be able to be accessed by the main method
     */
    public static void sayHello(String word, int num) {
        System.out.println("Hello " + word + ". You are " + num +" years old.");
    }
}
