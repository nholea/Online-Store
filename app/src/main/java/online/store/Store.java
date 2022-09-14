package online.store;

import java.util.ArrayList;

public class Store {

    private final ProductStorage productStorage = new ProductStorage();

    private final ProductFormat productFormat = new ProductFormat();

    public void showProductCatalogue(){
        String outputProductFormat = productFormat.outputProductFormat(productStorage.findAll());
        System.out.println(outputProductFormat);
    }

    public void showProductDetailsByReference(String reference){
        Product productFound = productStorage.findByReference(reference);
        String outputProductFormat = productFormat.outputProductDetailsFormat(productFound);
        System.out.println(outputProductFormat);
    }

    public void showProductsWithLowerPrice(Double price){
        ArrayList<Product> productsFound = productStorage.filterByPrice(price);
        String outputProductFormat = productFormat.outputProductFormat(productsFound);
        if (productsFound.size() ==0){
            System.out.println("No products found below this price");
        }
        System.out.println(outputProductFormat);
    }


}
