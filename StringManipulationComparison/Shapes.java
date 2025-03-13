public class Shapes{
    public static void main (String[]args){
        double shapeValue = 27.19;
        System.out.println("Current shape value is " + shapeValue);
        System.out.println("Transforming shape values...");
        int intShape = (int) shapeValue;
        System.out.println(intShape);
        long longShape = (long) shapeValue;
        System.out.println(longShape);
        float floatShape = (float) shapeValue;
        System.out.println(floatShape);


    }
}