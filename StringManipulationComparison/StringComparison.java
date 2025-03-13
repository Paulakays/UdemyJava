public class StringComparison{
    public static void main (String[]args){
        String firstSentence = "I am going  to the market";
        String secondSentence = "I am going  to the market";
        System.out.println(firstSentence==secondSentence);
        int age = 45;
        int age1 = 45;
        System.out.println(age==age1);
        String price = "two,four,Five";
        String price1 = "two,Four,five";
        System.out.println(price.equals(price1));
        System.out.println(price.equalsIgnoreCase(price1));
    }
}
