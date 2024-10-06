public class CardDetail {
    private int cardNumber;
    private int cardCVC;
    private int cardExpiry;
    private String cardHolderName;

    public void updateCartDetails(){

    }
    public void showCardDetails(){
        System.out.println(cardNumber);
        System.out.println(cardCVC);
        System.out.println(cardExpiry);
        System.out.println(cardHolderName);
    }
}
