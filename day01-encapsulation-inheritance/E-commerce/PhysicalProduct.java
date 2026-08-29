public class PhysicalProduct extends Product {
    private double weight; // unique to PhysicalProduct

    public PhysicalProduct(String name, double price, int stock, double weight) {
        super(name, price, stock);   // calls the PARENT's constructor
        this.weight = weight;
    }

    public void showShippingInfo() {
        System.out.println(name + " weighs " + weight + "kg, ships via courier.");
    }
}
