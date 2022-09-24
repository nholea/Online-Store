package online.store;

import java.util.ArrayList;


public class ProductFormat {

    ShoppingCart shoppingCart = new ShoppingCart();

    public String outputProductFormat(ArrayList<Product> products) {
        StringBuilder productFormat = new StringBuilder();
        for (Product product : products) {
            productAspectsFormat(productFormat, product.getProductImage());

            productAspectsFormat(productFormat, product.getDescription().getDescription());

            productAspectsFormat(productFormat, product.getDescription().getAttribute());

            productDetailsFormat(productFormat, String.valueOf(product.getPrice()), "\uD83D\uDCB0 Price: %s €");

            productDetailsFormat(productFormat, product.getReference(), "Reference: %s");

            productDetailsFormat(productFormat, String.valueOf(product.getUnitsInStock()),"%s left\n");


        }
        return productFormat.toString();

    }


    public String outputProductDetailsFormat(Product product) {
        StringBuilder productFormat = new StringBuilder();

        productAspectsFormat(productFormat, product.getProductImage());

        productDetailsFormat(productFormat, String.valueOf(product.getPrice()), "\uD83D\uDCB0 Price: %s €");

        productDetailsFormat(productFormat, product.getReference(), "Reference: %s");

        productDetailsFormat(productFormat, String.valueOf(product.getUnitsInStock()),"%s left\n");

        addExplanatoryTitle(productFormat, "SUMMARY:");

        productAspectsFormat(productFormat, product.getDescription().getDescription());

        addExplanatoryTitle(productFormat, "\nDESCRIPTION:");

        productAspectsFormat(productFormat, product.getDescription().getAttribute());

        return productFormat.toString();

    }

    public String outputShoppingCartContent(ArrayList<Product> shoppingCartProducts) {
        StringBuilder shoppingCartFormat = new StringBuilder();
        addExplanatoryTitle(shoppingCartFormat, "**** SHOPPING CART ****\n");
        for (Product product : shoppingCartProducts) {
            productAspectsFormat(shoppingCartFormat, product.getProductImage());

            productAspectsFormat(shoppingCartFormat, product.getDescription().getDescription());

            addExplanatoryTitle(shoppingCartFormat, "---");

            productDetailsFormat(shoppingCartFormat, String.valueOf(product.getPrice()), "\uD83D\uDCB0 Price: %s €");

            productDetailsFormat(shoppingCartFormat, product.getReference(), "Reference: %s");

            productDetailsFormat(shoppingCartFormat, String.valueOf(product.getUnitsInStock()),"%s left");

            productDetailsFormat(shoppingCartFormat, String.valueOf(shoppingCart.totalProductPrice(product)), "Subtotal: %s");

            addExplanatoryTitle(shoppingCartFormat, "---");
        }
        shoppingCartFormat.append(String.format("TOTAL: %s", shoppingCart.totalSumProductPrice(shoppingCartProducts)));
        shoppingCartFormat.append("\n\n");
        addExplanatoryTitle(shoppingCartFormat, "*************************");
        return shoppingCartFormat.toString();

    }
    private static void productAspectsFormat(StringBuilder productBuilder, String product) {
        productBuilder.append(product);
        productBuilder.append("\n");
    }
    private static void productDetailsFormat(StringBuilder productFormat, String product, String fieldProductFormat) {
        productFormat.append(String.format(fieldProductFormat, product));
        productFormat.append("\n");
    }

    private static void addExplanatoryTitle(StringBuilder productFormat, String title) {
        productFormat.append(title);
        productFormat.append("\n");
    }

}
