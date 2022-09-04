package online.store;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductCatalogue implements ProductRepository{

    private final ArrayList<Product> products = new ArrayList<>(Arrays.asList(new Product("Television","📺" , new Description("Glamorous panoramic television, 13 inches", "With this panoramic television, your friday nights will be boring no more."),300.99, "W2C"), new Product("Musical Keyboard", "🎹", new Description("Untuned musical keyboard, 4 octaves", "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home and your neighbour will be ready to move to a building far away from you."),1003.00, "X4A")));


    @Override
    public ArrayList<Product> findAll(){
        return products;
    }



}
