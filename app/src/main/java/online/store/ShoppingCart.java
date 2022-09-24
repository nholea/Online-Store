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

    public double totalProductPrice(Product product) {
        return product.getPrice() * product.getUnitsInStock();
    }

    public double totalSumProductPrice(ArrayList<Product> products) {
        return products.stream().mapToDouble(product -> product.getPrice()* product.getUnitsInStock()).sum();
    }



}
