public class enhancedLoopsArrays {
    public static void main(String[] args) {

        String[][] myArray = {
                {"apples", "bananas", "tomatoes"},
                {"cars", "houses", "carrots"},
                {"programming", "support", "design"}
        };

        //Iterates through rows
        for (String[] rows : myArray) {
            for (String columns : rows) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }

    }
}
