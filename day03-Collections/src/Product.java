import java.util.HashSet;
import java.util.Set;

public class Product{
    public static void main(String[] args){
        Set<String> uniqueCities = new HashSet<>();

        uniqueCities.add("Bengaluru");
        uniqueCities.add("Mumbai");
        uniqueCities.add("Bengaluru");//duplicates are ignored in sets
        uniqueCities.add("Mysore");
        uniqueCities.add("Mandya");

        for(String city:  uniqueCities){
            System.out.print(city+" ");
        }

        uniqueCities.remove("Mumbai"); //remove the element form the set
        uniqueCities.remove(0); //does not affect the set or remove anything because there is no order

        if(uniqueCities.contains("Mumbai")) //check the existence of the element
            System.out.println("\nMumbai is in the set");
        else
            System.out.println("\nMumbai is not in the set");

        for(String city:  uniqueCities){
            System.out.print(city+" ");
        }

        if(uniqueCities.isEmpty()) { //checks the set is Empty or not -- boolean
            System.out.println("\nSet is Empty! Add some Elements");
        }
        else
            System.out.println("\nSet has :"+uniqueCities.size()+"elements"); //Total number of unique elements

        uniqueCities.clear(); //deleting all elements in the set
    }
}