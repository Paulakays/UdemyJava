import java.util.*;

public class arraysIteration {
    public static void main(String[] args) {

        // The values are placed in a 3 rows and 10 columns arrangement
      int [][] myArray = new int[3][10];

      /*The first array value represents the row in which the value is going to
       be placed while the second value represents the column in which the value is
       going to be placed

       */
      myArray[0][0] = 1;
      myArray[0][1] = 2;
      myArray[0][2] = 3;
      myArray[0][3] = 4;
      myArray[0][4] = 5;
      myArray[0][5] = 6;
      myArray[0][6] = 7;
      myArray[0][7] = 8;
      myArray[0][8] = 9;
      myArray[0][9] = 10;
      myArray[1][0] = 1;
      myArray[1][1] = 2;
      myArray[1][2] = 3;
      myArray[1][3] = 4;
      myArray[1][4] = 5;
      myArray[1][5] = 6;
      myArray[1][6] = 7;
      myArray[1][7] = 8;
      myArray[1][8] = 9;
      myArray[1][9] = 10;
      myArray[2][0] = 1;
      myArray[2][1] = 2;
      myArray[2][2] = 3;
      myArray[2][3] = 4;
      myArray[2][4] = 5;
      myArray[2][5] = 6;
      myArray[2][6] = 7;
      myArray[2][7] = 8;
      myArray[2][8] = 9;
      myArray[2][9] = 10;

      System.out.println(myArray.length);

      //Iterates through each row
       for (int i = 0; i < myArray.length; i++) {

           //Iterates through each Data type (int)
           //"myArray[i].length" -> Whatever length of columns the array has will be iterated through
           for (int j = 0; j < myArray[i].length; j++) {
               System.out.print(myArray[i][j] + " ");
           }
           //Creates spacing between each row
           System.out.println();
       }


    }
}
