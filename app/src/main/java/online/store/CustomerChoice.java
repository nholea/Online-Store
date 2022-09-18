package online.store;

import java.util.Scanner;

public class CustomerChoice {

    public final Store store = new Store();

    public void productDetails(){
        int inputCustomerChoice = customerDesires();
        if (customerWantsSeeProductList(inputCustomerChoice)) {
            store.showProductCatalogue();
            productDetails();
        }
    }

    private int customerDesires() {
        System.out.println("Which product would you like to explore? - Introduce a product's reference.");
        Scanner input = new Scanner(System.in);
        String inputReference = input.nextLine();
        store.showProductDetailsByReference(inputReference);

        System.out.println("""
                ¿What would you like to do next?
                1. Add product to cart
                2. Keep browsing products
                """);

        return input.nextInt();
    }

    private static boolean customerWantsSeeProductList(int inputCustomerChoice) {
        return inputCustomerChoice == 2;
    }
}
