package online.store;

import java.util.ArrayList;


public class ProductFormat {


    public String outputProductFormat(ArrayList<Product>products) {
        StringBuilder formatProduct = new StringBuilder();
        for(Product product : products){
            formatProduct.append(product.getProductImage());
            formatProduct.append("\n");

            formatProduct.append(product.getDescription().getDescription());
            formatProduct.append("\n");

            formatProduct.append(product.getDescription().getAttribute());
            formatProduct.append("\n");

            String priceFormat = "\uD83D\uDCB0 Price: %s €";
            formatProduct.append(String.format(priceFormat,product.getPrice()));
            formatProduct.append("\n");

            String referenceFormat = "Reference: %s \n";
            formatProduct.append(String.format(referenceFormat,product.getReference()));
            formatProduct.append("\n");

        }
        return formatProduct.toString();

    }


}
