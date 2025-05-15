package ra.ss08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.ss08.model.Product;
import ra.ss08.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String showProductList(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "listProduct";
    }

    // Hiển thị form thêm mới sản phẩm
    @GetMapping("/products/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    // Xử lý form thêm mới sản phẩm
    @PostMapping("/products/add")
    public String addProduct(@ModelAttribute("product") Product product, Model model) {
        productService.addProduct(product);  // Giả sử có phương thức này
        model.addAttribute("product", product);
        return "viewProduct";
    }
}
