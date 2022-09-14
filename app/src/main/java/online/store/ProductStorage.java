package online.store;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductStorage implements ProductRepository{

    private final ArrayList<Product> products = new ArrayList<>(Arrays.asList(
            new Product("Television",
                        "\uD83D\uDCFA" ,
                        new Description("Glamorous panoramic television, 13 inches",
                                        "With this panoramic television, your friday nights will be boring no more.\n" +
                                                "The screen is composed of 14 million pixels.\n" +
                                                "Thanks to its low energy consumption design, your bills will stay low."),
                        300.99,
                        "W2C",
                        20),
            new Product("Musical Keyboard",
                        "\uD83C\uDFB9",
                        new Description("Untuned musical keyboard, 4 octaves",
                                        "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home and your neighbour \n" +
                                                "will be ready to move to a building far away from you."),
                       1003.00,
                       "X4A",
                       100),
            new Product("Mobile Phone",
                    "\uD83D\uDCF1" ,
                    new Description("New mobile phone model,512 GB",
                            "With this mobile phone, you will be able to take all kinds of photos thanks to its amazing camera.\n" +
                                    "You no longer have to worry about memory storage.\n"),
                    459.25,
                    "Z8T",
                    5)));

    @Override
    public ArrayList<Product> findAll(){
        return products;
    }

    @Override
    public Product findByReference(String reference){
        Product productFound = null;
        for(Product product : findAll()){
            if (product.getReference().equals(reference)){
                productFound = product;
            }
        }
        return productFound;
    }


}

