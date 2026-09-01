public class RegularCustomer implements Discountable {
    @Override
    public double applyDiscount(double price) {
        return price * 0.95;
    }
}