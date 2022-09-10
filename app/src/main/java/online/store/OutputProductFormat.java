package online.store;

public class OutputProductFormat {
    private final ProductStorage productStorage;

    public OutputProductFormat(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }

    public void productFormat(){
        for(Product product : productStorage.findAll()){
            System.out.println(product.getProductImage()
                    +"\n" + product.getDescription().getDescription()
                    + "\n" + product.getDescription().getAttribute()
                    +"\n\uD83D\uDCB0 Price: " + product.getPrice()
                    + " €\nReference: " + product.getReference()+ "\n");
        }
    }
}
