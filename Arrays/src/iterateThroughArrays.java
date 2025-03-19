public class iterateThroughArrays {
    public static void main (String[]args){
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array length is " + numbers.length);

        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
