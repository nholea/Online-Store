package online.store;

public class Product {
    private final String name;
    private final String productImage;

    private final Description description;
    private final Double price;
    private final String reference;

    public Product(String name, String productImage, Description description, Double price, String reference) {
        this.name = name;
        this.productImage = productImage;
        this.description = description;
        this.price = price;
        this.reference = reference;
    }

    public String getName(){
        return name;
    }

    public String getProductImage(){
        return productImage;
    }

    public Description getDescription(){
        return description;
    }

    public Double getPrice(){
        return price;
    }

    public String getReference(){
        return reference;
    }

    public String outputProductFormat() {
        return productImage
                +"\n" + description.getDescription()
                + "\n" + description.getAttribute()
                +"\n\uD83D\uDCB0 Price: " + price
                +" €\nReference: " + reference+ "\n";
    }


}
