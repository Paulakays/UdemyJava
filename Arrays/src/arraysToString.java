import java.util.*;

public class arraysToString {
    public static void main (String[]args){
        int[] nums = {10,25,73,45,5};

        //Returns values to String without having to initialise a String value
        System.out.println(Arrays.toString(nums));

        //Sorts values according to their alphabetical or numerical order
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //Searches the values of the key given. If the value is not found, the output will return "-inserted search value" Eg; when searching for 1 the return will be -1
        //The Array must be sorted in order for the binarySearch to give defined results
        //If the value being searched is a duplicate number, the return will randomly be picked out
        Arrays.binarySearch(nums, 25);
        System.out.println(Arrays.binarySearch(nums,25));

        //Returns all values in nums
        int[] backupOfNums = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(backupOfNums));

        //Returns only four values
        int[] backupOfNum = Arrays.copyOf(nums, 4);
        System.out.println(Arrays.toString(backupOfNum));

        //Returns all values available and replaces the rest of the missing values with 0
        int[] backupOfNumbers = Arrays.copyOf(nums,20);
        System.out.println(Arrays.toString(backupOfNumbers));

        //Fills the  array with the value 9 from the second position of the array to the sixth position and the rest of the array list with 0
        int[] numbers = new int[9];
        Arrays.fill(numbers, 2,7,9);

        //Fills the  array with the value 6 from the seventh position of the array to the eighth position
        Arrays.fill(numbers, 7,9,6);
        System.out.println(Arrays.toString(numbers));


    }
}
