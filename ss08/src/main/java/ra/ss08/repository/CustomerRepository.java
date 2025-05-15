package ra.ss08.repository;



import ra.ss08.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}