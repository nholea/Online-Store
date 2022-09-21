package online.store;

import java.util.Locale;
import java.util.Scanner;

public class CustomerChoice {

    private final Store store = new Store();
    private final ShoppingCart shoppingCart = new ShoppingCart();

    private final ProductStorage productStorage = new ProductStorage();

    public void filterProductsByPrice() {
        int inputCustomerChoice = customerActions();

        if (customerDesires(inputCustomerChoice, 2)) {
            filterProductsByPrice();

        } else if (customerDesires(inputCustomerChoice, 3)) {
            shoppingCartOptions();
        }

    }
    private static boolean customerDesires(int inputCustomerChoice, int choice) {
        return inputCustomerChoice == choice;
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

    private Product productDetailsByReference() {
        System.out.println("Enter a product's reference:");
        Scanner scanner = new Scanner(System.in);
        String inputReference = scanner.nextLine();
        Product productFoundByReference = productStorage.findByReference(inputReference);
        store.showProductDetailsByReference(inputReference);
        return productFoundByReference;
    }

    private void shoppingCartOptions() {
        Product productSelected = productDetailsByReference();
        int inputsCustomerCartChoice = addSelectedProductToCart(productSelected);

        if (customerDesires(inputsCustomerCartChoice, 2)) {
            filterProductsByPrice();
        }else if (customerDesires(inputsCustomerCartChoice, 3)) {
            productDetailsByReference();
        }
    }

    private int addSelectedProductToCart(Product productSelected) {
        System.out.println("Would you like to add this product to the cart?");
        Scanner scanner = new Scanner(System.in);
        String customerResponse = scanner.nextLine();

        if(customerResponse.equals("YES")){
            shoppingCart.addProduct(productSelected);
            shoppingCart.totalProductPrice(productSelected);
            System.out.println("\n" + productSelected.getDescription().getDescription() + " was added to cart\n");
        }
        System.out.println("""
                ¿What would you like to do next?
                2. Keep browsing the catalog
                3. See a product's details.""");

        return scanner.nextInt();
    }



}
