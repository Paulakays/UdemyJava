import java.util.*;

public class easierArrayIteration {
    public static void main(String[] args) {

        String[][] myArray = {
                {"apples", "bananas", "tomatoes"},
                {"cars", "houses", "carrots"},
                {"programming","support","design"}

        };

        for (int i = 0; i <myArray.length; i++){
            for ( int j = 0; j < myArray[i].length; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
