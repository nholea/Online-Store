package online.store;

import java.util.ArrayList;

public interface ProductRepository {

    ArrayList<Product> findAll();

    Product findByReference(String reference);
}
