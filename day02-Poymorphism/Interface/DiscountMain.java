public class DiscountMain {
    public static void main(String[] args) {
        RegularCustomer discount = new RegularCustomer();
        Discountable discount1 = new RegularCustomer();
        Discountable discount2 = new PremiumCustomer();
        System.out.println("Regular Customer: " + discount.applyDiscount(1000.0));
        System.out.println("Regular Customer: " + discount1.applyDiscount(1000.0));
        System.out.println("Premium Customer: " + discount2.applyDiscount(1000.0));
    }
}
