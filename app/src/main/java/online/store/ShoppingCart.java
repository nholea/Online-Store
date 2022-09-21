package online.store;

import java.util.ArrayList;

public class ShoppingCart {

    private final ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    public ArrayList<Product> findAll(){
        return products;
    }
}
