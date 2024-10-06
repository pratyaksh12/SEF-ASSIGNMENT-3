import java.util.ArrayList;

public class Catalogue {

    private ArrayList<Product> catalogueProducts;

    public void viewProducts(){
        for(Product product : catalogueProducts){
            System.out.println(product);
        }

    }
    public void filterProducts(){

    }
    public boolean searchProducts(Product product){
        return false;
    }

}
