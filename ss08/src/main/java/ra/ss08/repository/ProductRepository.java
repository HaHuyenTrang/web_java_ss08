package ra.ss08.repository;

import org.springframework.stereotype.Repository;
import ra.ss08.model.Product;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();
    private int currentId = 1;

    public ProductRepository() {
        products.add(new Product(currentId++, "ip 14 pl", 10, 20000));
        products.add(new Product(currentId++, "macbook", 5, 150000));
        products.add(new Product(currentId++, "lap HP", 7, 30000));
    }

    public List<Product> findAll() {
        return products;
    }

    public void add(Product product) {
        product.setId(currentId++);
        products.add(product);
    }
}
