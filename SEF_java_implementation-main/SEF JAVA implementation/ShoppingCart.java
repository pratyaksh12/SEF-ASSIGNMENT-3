import java.util.ArrayList;

public class ShoppingCart {
    private int cartID = 123456789;
    private double totalPrice = 0.0;
    private ArrayList<Product> productList;
    CheckOut checkout;

    public void updateCart(Product product){
        if (product == null){
            throw new IllegalArgumentException("product cannot be null");
        }
        totalPrice += product.getPrice();
    }

    public void showProducts() {
        if (productList.isEmpty()) {
            System.out.println("your cart is empty");
        } else {
            for (Product product : productList) {
                product.getDetails();
            }
        }
    }

    public void showTotalPrice() {
        System.out.println(totalPrice);
    }

    // init a checkout that is linked with the cart

    public void proceedToCheckout() {
        if (checkout == null){
            this.checkout = new CheckOut();
            this.checkout.addCart(this);
        }else{
            System.out.println("Checkout in progress...");
        }
    }

    // sending the message to the customer regarding the payment of the order

    public void paymentSuccess() {
        if (checkout != null && checkout.confirmPayment()) {
            System.out.println("Payment successful : the receipt will be sent to you through an email.");
        } else {
            System.out.println("Payment failed or the cat was not initialised");
        }
    }
}
