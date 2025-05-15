package ra.ss08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.ss08.model.Customer;
import ra.ss08.service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String findAll(Model model) {
        List<Customer> customers = customerService.findAll();
        System.out.println("Size: " + customers.size());
        // model truyen du lieu ra view
        model.addAttribute("customers", customers);

        return "customer"; // file customer.jsp
    }
}