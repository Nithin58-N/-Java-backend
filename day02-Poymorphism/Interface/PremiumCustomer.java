public class PremiumCustomer implements Discountable{
    @Override
    public double applyDiscount(double price){
        return price * 0.80;
    }
}