import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    // Method 1: restock a product if it exists, otherwise print a not-found message
    public static void restockProduct(Map<String, Integer> inventory, String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            int currentStock = inventory.get(productName);
            int newStock = currentStock + quantity;
            inventory.put(productName, newStock);
            System.out.println(productName + " restocked. New stock: " + newStock);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    public static void main(String[] args) {

        // 1. Create inventory map with 4 products
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Laptop", 10);
        inventory.put("Mouse", 3);
        inventory.put("Keyboard", 4);
        inventory.put("Monitor", 7);

        System.out.println("---- Initial Inventory ----");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n---- Restocking ----");
        restockProduct(inventory, "Mouse", 5);       // exists -> should update
        restockProduct(inventory, "Headphones", 10); // doesn't exist -> should print not found

        System.out.println("\n---- Inventory After Restock ----");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 2. Find low-stock products (less than 5) using a Set
        Set<String> lowStockAlerts = new HashSet<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() < 5) {
                lowStockAlerts.add(entry.getKey());
            }
        }

        System.out.println("\n---- Low Stock Alerts (below 5) ----");
        System.out.println(lowStockAlerts);
    }
}