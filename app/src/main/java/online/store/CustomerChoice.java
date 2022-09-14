package online.store;

import java.util.Scanner;

public class CustomerChoice {

    public final Store store = new Store();

    public void ProductDetails(){
        System.out.println("Which product would you like to explore? - Introduce a product's reference.");
        Scanner input = new Scanner(System.in);
        String inputReference = input.nextLine();
        store.showProductDetailsByReference(inputReference);

        System.out.println("¿What would you like to do next?\n" +
                "1. Add product to cart\n" +
                "2. Keep browsing products\n");

        int inputChoice = input.nextInt();
        if (inputChoice == 2) {
            store.showProductCatalogue();
        }
    }
}
