package online.store;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args){
        Store store = new Store();
        CustomerChoice customerChoice = new CustomerChoice();
        store.showProductCatalogue();

        customerChoice.productDetails();

    }
}
