package online.store;

import java.util.ArrayList;


public class ProductFormat {


    public String outputProductFormat(ArrayList<Product> products) {
        StringBuilder productFormat = new StringBuilder();
        for (Product product : products) {
            productFormat.append(product.getProductImage());
            productFormat.append("\n");

            productFormat.append(product.getDescription().getDescription());
            productFormat.append("\n");

            productFormat.append(product.getDescription().getAttribute());
            productFormat.append("\n");

            String priceFormat = "\uD83D\uDCB0 Price: %s €";
            productFormat.append(String.format(priceFormat, product.getPrice()));
            productFormat.append("\n");

            String referenceFormat = "Reference: %s";
            productFormat.append(String.format(referenceFormat, product.getReference()));
            productFormat.append("\n");

            String unitsInStockFormat = "%s left\n";
            productFormat.append(String.format(unitsInStockFormat, product.getUnitsInStock()));
            productFormat.append("\n");

        }
        return productFormat.toString();

    }

    public String outputProductDetailsFormat(Product product) {
        StringBuilder productFormat = new StringBuilder();

        productFormat.append(product.getProductImage());
        productFormat.append("\n");

        String referenceFormat = "Reference: %s ";
        productFormat.append(String.format(referenceFormat, product.getReference()));
        productFormat.append("\n");

        String priceFormat = "\uD83D\uDCB0 Price: %s €";
        productFormat.append(String.format(priceFormat, product.getPrice()));
        productFormat.append("\n");

        String unitsInStockFormat = "%s left\n";
        productFormat.append(String.format(unitsInStockFormat, product.getUnitsInStock()));
        productFormat.append("\n");

        productFormat.append("SUMMARY:");
        productFormat.append("\n");

        productFormat.append(product.getDescription().getDescription());
        productFormat.append("\n\n");

        productFormat.append("DESCRIPTION:");
        productFormat.append("\n");

        productFormat.append(product.getDescription().getAttribute());
        productFormat.append("\n\n");

        return productFormat.toString();


    }


}
