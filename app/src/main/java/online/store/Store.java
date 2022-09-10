package online.store;

public class Store {

    private final ProductStorage productStorage;


    public Store(ProductStorage productStorage) {
        this.productStorage = productStorage;

    }

    public void showProductCatalogue(){
        for(Product product : productStorage.findAll()){
            System.out.println(product.outputProductFormat());
        }

    }


}
