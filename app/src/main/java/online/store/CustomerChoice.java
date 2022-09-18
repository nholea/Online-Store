package online.store;

import java.util.Locale;
import java.util.Scanner;

public class CustomerChoice {

    public final Store store = new Store();

    public void filterProductsByPrice() {
        int inputCustomerChoice = customerActions();

        if (customerDesires(inputCustomerChoice, 2)) {
            filterProductsByPrice();

        } else if (customerDesires(inputCustomerChoice, 3)) {
            productDetailsByReference();
        }

    }

    private int customerActions() {
        System.out.println("Browse products with prices lower than:");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double inputPrice = input.nextDouble();
        store.showProductsWithLowerPrice(inputPrice);

        System.out.println("""
                ¿What would you like to do next?
                2. Keep browsing the catalog
                3. See a product's details.""");

        return input.nextInt();
    }

    private void productDetailsByReference() {
        System.out.println("Enter a product's reference:");
        Scanner scanner = new Scanner(System.in);
        String inputReference = scanner.nextLine();
        store.showProductDetailsByReference(inputReference);
    }

    private static boolean customerDesires(int inputCustomerChoice, int choice) {
        return inputCustomerChoice == choice;
    }

}
