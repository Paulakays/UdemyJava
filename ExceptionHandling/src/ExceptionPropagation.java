public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            processOrder();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void processOrder() throws Exception{
       calculateTotalPrice();
    }

    public static void calculateTotalPrice() throws Exception{
      checkInventory();
    }

    public static void checkInventory() throws Exception{
        throw new Exception("Insufficient inventory for the order");
    }
}
