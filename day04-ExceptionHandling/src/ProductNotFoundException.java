public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);  // passes the message up to the built-in Exception class
    }
}