package online.store;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args){
        Store store = new Store();
        store.showProductCatalogue();

        System.out.println("Which product would you like to explore? - Introduce a product's reference.");
        Scanner input = new Scanner(System.in);
        String inputReference = input.nextLine();

        store.showProductDetailsByReference(inputReference);

        int inputChoice = input.nextInt();

        if (inputChoice == 2) {
            store.showProductCatalogue();
        }
    }
}
