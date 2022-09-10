package online.store;

public class Customer {

    public static void main(String[] args){
        ProductStorage productStorage = new ProductStorage();
        Store store = new Store(productStorage);
        store.showProductCatalogue();
    }
}
