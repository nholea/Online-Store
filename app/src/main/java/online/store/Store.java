package online.store;

public class Store {

    private final OutputProductFormat outputProductFormat;


    public Store(OutputProductFormat outputProductFormat) {
        this.outputProductFormat = outputProductFormat;

    }

    public void showProductCatalogue(){
        outputProductFormat.productFormat();

    }


}
