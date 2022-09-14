package online.store;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args){
        Store store = new Store();
        double inputPrice;
        int inputChoice;
        System.out.println("Browse products with prices lower than:");
        Scanner input = new Scanner(System.in);
        inputPrice = input.nextDouble();
        store.showProductsWithLowerPrice(inputPrice);

        System.out.println("¿What would you like to do next?\n" +
                            "2. Keep browsing the catalog\n"+
                            "3. See a product's details.");

        inputChoice = input.nextInt();

        if (inputChoice == 2) {
          //("Browse products with prices lower than:");
            //inputPrice = input.nextDouble();
            store.showProductsWithLowerPrice(inputPrice);
           // System.out.println("¿What would you like to do next?\n" +
                   // "2. Keep browsing the catalog\n"+
                   // "3. See a product's details.");

          //  inputChoice = input.nextInt();
        }

        if (inputChoice == 3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a product's reference:");
            String inputReference = scanner.nextLine();
            store.showProductDetailsByReference(inputReference);

        }

    }
}
