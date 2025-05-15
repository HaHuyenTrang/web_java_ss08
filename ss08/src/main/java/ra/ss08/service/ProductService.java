package ra.ss08.service;

import ra.ss08.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
}
