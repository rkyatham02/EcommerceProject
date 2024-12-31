package com.rishith.ecom_proj.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rishith.ecom_proj.model.Product;
import com.rishith.ecom_proj.service.ProductService;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProductById(id);    
    }
}
 