public class Product {
    private String productID;
    private String productName;    
    private String productDescription;
    private int price;
    private int rating;
    private String review;    
    private int quantity;


    public void virtualTryOn(){
        
    }

    public void getDetails(){
        System.out.println(productName);
        System.out.println(productID);        
        System.out.println(productID);
        System.out.println(productDescription);
        System.out.println(rating);
        System.out.println(review);
        System.out.println(price);
    }

    public void updateStock(int quantity){

    }

    public int getQuantity(){
        return quantity;
    }

    public int getPrice(){
        return price;
    }

}
