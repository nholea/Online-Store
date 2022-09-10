package online.store;

public class Customer {

    public static void main(String[] args){
        ProductCatalogue productCatalogue = new ProductCatalogue();
        Store store = new Store(productCatalogue);
        store.showProductCatalogue();
    }
}
