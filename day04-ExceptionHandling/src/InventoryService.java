import java.util.HashMap;
import java.util.Map;

public class InventoryService extends RuntimeException{

    public void checkProduct(Map<String, Integer> inventory, String name) throws ProductNotFoundException {
        if (!inventory.containsKey(name)) {
            throw new ProductNotFoundException("Product not found: " + name);
        }
        System.out.println(name + " is available.");
    }

    public void purchaseProduct(Map<String,Integer> inventory, String productName, int quantity) throws ProductNotFoundException, InsufficientStockException{
        checkProduct(inventory,productName);
        int stock = inventory.get(productName);
        //System.out.println("product: " + productName + "\tStock: " + stock);
        if (stock < quantity) {
            throw new InsufficientStockException(productName+" is out of stock");
        }
        stock -= quantity;
        inventory.put(productName, stock);
        System.out.println("Purchased " + quantity + " " + productName + ". Remaining: " + stock);
    }
}