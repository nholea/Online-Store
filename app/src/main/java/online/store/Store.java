package online.store;

public class Store {

    private final ProductStorage productStorage = new ProductStorage();

    private final ProductFormat productFormat = new ProductFormat();

    public void showProductCatalogue(){
        System.out.println(productFormat.outputProductFormat(productStorage.findAll()));
    }


}
