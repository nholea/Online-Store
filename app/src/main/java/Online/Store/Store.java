package Online.Store;

public class Store {

    private final ProductCatalogue productCatalogue;

    public Store(ProductCatalogue productCatalogue) {
        this.productCatalogue = productCatalogue;
    }


    public void showProductCatalogue(){
        for(Product product : productCatalogue.findAll()) {

            System.out.println(product.getProductImage() +"\n" + product.getDescription().getDescription() + "\n" + product.getDescription().getAttribute() +"\n \uD83D\uDCB0 Price: " + product.getPrice() + " €\n Reference: " + product.getReference()+ "\n");
        }
    }

    public static void main(String[] args){
        Store store = new Store(new ProductCatalogue());

        store.showProductCatalogue();

    }
}
