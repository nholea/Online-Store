package online.store;

public class Customer {

    public static void main(String[] args){
        ProductStorage productStorage = new ProductStorage();
        OutputProductFormat outputProductFormat = new OutputProductFormat(productStorage);
        Store store = new Store(outputProductFormat);
        store.showProductCatalogue();
    }
}
