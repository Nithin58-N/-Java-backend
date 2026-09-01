public class Invoice {
    public double calculateTotal(double price, int quantity){
        return price*quantity;
    }
    public double calculateTotal(double price, int quantity, double discount){
        return (price * quantity) - discount;
    }
    public static void main(String[] args) {
        Invoice invoice = new Invoice();

        System.out.println(invoice.calculateTotal(500.0,5));
        System.out.println(invoice.calculateTotal(600,10,100));
    }
}
