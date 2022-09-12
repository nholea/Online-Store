package online.store;

public class Store {

    private final ProductStorage productStorage = new ProductStorage();

    public void showProductCatalogue(){
        for(Product product : productStorage.findAll()){
            System.out.println(product.outputProductFormat());
        }

    }


}
