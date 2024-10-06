public class CheckOut {
    private ShoppingCart cart;
    private CardDetail card = null;
    private boolean completePayment = false;

    //validating the payment with the bank
    private void validatePayment(){
        if(card == null || cart == null){
            throw new IllegalStateException("Invalid card or cart");
        }

        this.completePayment = true;
    }


    //linking the cart with the order
    public void addCart(ShoppingCart cart){
        if(cart == null){
            throw new IllegalArgumentException("Shopping cart is empty");
        }else{
            this.cart = cart;
        }
    }


    //adding card details

    public void addCardDetails(CardDetail card){
        if(card == null){
            throw new IllegalArgumentException("The card details are missing");
        }
        this.card = card;
    }


    //checking for discout
    public void applyDiscount(){
        
    }

    //checking if the payment was successful with the bank
    public boolean confirmPayment(){
        System.out.println("sendiing the details to a payment gateway...");
        validatePayment();
        return completePayment;
    }
}
