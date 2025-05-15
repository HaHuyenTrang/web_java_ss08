package ra.ss08.repository;

import org.springframework.stereotype.Repository;
import ra.ss08.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "ip 14 pl",2,12345));
        list.add(new Product(2, "macboook",2,234567));
        list.add(new Product(3, "lap HP",3,23456));
        return list;
    }
}
