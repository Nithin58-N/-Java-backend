public class Main2 {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 55000.0, 10);
        Product mouse = new Product("Mouse", 500.0, 50);

        System.out.println(laptop.getName() + " - Stock: " + laptop.getStock());
        System.out.println(mouse.getName() + " - Stock: " + mouse.getStock());

        laptop.setStock(15);       // valid update
        laptop.setStock(-5);       // should print an error, stock stays 15

        System.out.println("Updated Laptop Stock: " + laptop.getStock());

        PhysicalProduct laptop2 = new PhysicalProduct("Laptop", 55000.0, 10, 2.5);
        
        laptop.displayInfo();       // inherited from Product
        laptop2.showShippingInfo();  // defined in PhysicalProduct itself
    }
}

