import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,String>capitalCities = new java.util.HashMap<>();
        /*
        To list the items as written use LinkedHashMap:
        Map<String,String>capitalCities = new LinkedHashMap<>();
*/
        capitalCities.put("Nigeria","Lagos");
        capitalCities.put("Kenya","Nairobi");
        capitalCities.put("Uganda","Kampala");

        System.out.println("The capital city of Kenya is :" + capitalCities.get("Kenya"));

        capitalCities.remove("Nigeria");
        capitalCities.replace("Kenya","Cape Town");

        //Iterates through the first String only
        for (String city : capitalCities.keySet()) {
            System.out.println(city);
        }
        //Iterate through all items in the list
        for(Map.Entry<String,String> city : capitalCities.entrySet()){
            System.out.println("Country: " + city.getKey() + " Capital city: " + city.getValue());
        }

        boolean containsKey = capitalCities.containsKey("Kenya");
        System.out.println("Contains Kenya: " + containsKey);

    }
}
