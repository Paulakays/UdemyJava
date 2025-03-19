import java.util.*;

public class getLargestNumberInArrays {
    public static void main(String[] args) {

        int [][] numbers ={
                {45,67,91,33,50},
                {97,34,55,71,110}
        };
        //Initialize starting point of the largest number as the first number
        int largest = numbers[0][0];
        int lowest = numbers[0][0];
        //Initialize the sum as 0
        int sum = 0;
        //Goes through each 1D array
        for (int[] rows : numbers) {
            //Iterates through the rows
            for (int num : rows) {
                sum += num;
                /* Through each row iteration, the numbers  are checked to see
                whether they are the largest in the row and are kept track of till
                another larger number is found while still progressing to the next row.
                largest is overwritten with whatever the number is.
                 */
            if (num > largest) {
                largest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("The lowest number is " + lowest);
        System.out.println("The sum is " + sum);
    }
}
