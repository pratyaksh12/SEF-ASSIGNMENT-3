public class RegisteredCustomer extends Customer {
    private int points;
    private String password;

    public boolean sendOfferAlert(){
        return true;
    }

    public void login(){
        System.out.println(password);
    }

    public void redeemPoints(){
        System.out.println(points);
    }

    public void checkPreviousOrders(){
        
    }

}
