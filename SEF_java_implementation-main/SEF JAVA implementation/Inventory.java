/**
 * Inventory
 */
import java.util.ArrayList;
public class Inventory {

    private ArrayList<Product> stockProducts;

    public boolean checkAvailability(Product product){
        return product.getQuantity() > 0;
    }

    public void addProducts(Product product){
        stockProducts.add(product);
    }

    public void removeProduct(Product product){
        stockProducts.remove(product);
    }

    public void updateProductStock(){
        for(Product product : stockProducts){
            product.getQuantity();
        }
    }
}