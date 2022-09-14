package online.store;

import java.util.Locale;
import java.util.Scanner;

public class CustomerChoice {

    public final Store store = new Store();

    public void productDetails(){
        System.out.println("Which product would you like to explore? - Introduce a product's reference.");
        Scanner input = new Scanner(System.in);
        String inputReference = input.nextLine();
        store.showProductDetailsByReference(inputReference);

        System.out.println("""
                ¿What would you like to do next?
                1. Add product to cart
                2. Keep browsing products
                """);

        int inputChoice = input.nextInt();
        if (inputChoice == 2) {
            store.showProductCatalogue();
        }
    }

    public void filterProductsByPrice(){
        System.out.println("Browse products with prices lowe than:");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Double inputPrice = input.nextDouble();
        store.showProductsWithLowerPrice(inputPrice);

        System.out.println("""
                ¿What would you like to do next?
                2. Keep browsing the catalog
                3. See a product's details.""");

        int inputChoice = input.nextInt();

        while(inputChoice == 2) {
            System.out.println("Browse products with prices lowe than:");
            input = new Scanner(System.in).useLocale(Locale.US);
            inputPrice = input.nextDouble();
            store.showProductsWithLowerPrice(inputPrice);

            System.out.println("""
                ¿What would you like to do next?
                2. Keep browsing the catalog
                3. See a product's details.""");

            inputChoice = input.nextInt();
        }

        if (inputChoice == 3) {
            System.out.println("Enter a product's reference:");
            Scanner scanner = new Scanner(System.in);
            String inputReference = scanner.nextLine();
            store.showProductDetailsByReference(inputReference);
        }

    }
}
