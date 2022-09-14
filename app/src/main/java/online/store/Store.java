package online.store;

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


}
