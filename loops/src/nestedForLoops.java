public class nestedForLoops {
    public static void main (String[]args){
        for(int i=0; i<10; i++){
            System.out.println(i);
            for(int j=0; j<10; j++){
                System.out.println(j);
                /*Every time i is run, an increment occurs and checks if the highest value between 0 and 10 has been attained.
                While at it, since j is within i, It makes sure that it also runs the same way.
                That is, every time i is executed, j is executed too but systematically till both have attained the maximum value between
                0 and 9


                 */
            }
        }
    }
}
