package online.store;

public class Store {

    private final ProductCatalogue productCatalogue;

    public Store(ProductCatalogue productCatalogue) {
        this.productCatalogue = productCatalogue;
    }


    public void showProductCatalogue(){
        for(Product product : productCatalogue.findAll()) {

            System.out.println(product.getProductImage() +"\n" + product.getDescription().getDescription() + "\n" + product.getDescription().getAttribute() +"\n💰 Price: " + product.getPrice() + " €\nReference: " + product.getReference()+ "\n");
        }
    }


}
