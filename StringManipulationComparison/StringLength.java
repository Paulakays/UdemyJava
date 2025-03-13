public class StringLength{
    public static void main (String[]args){
        String sentence = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus estLorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor ";
        int numberOfLetters = sentence.length();
        System.out.print(numberOfLetters);

        /*Getting a specific charachter from a String.
        CharAt(index)-> (index is the position of the character in the sentence).
        numbering starts from 0. Every spacing is also counted as a character*/
        String sentensi= "Mama akasema anapika misheveve";
        char tenthNumber = sentensi.charAt(10);
        System.out.print(tenthNumber);
    }
}