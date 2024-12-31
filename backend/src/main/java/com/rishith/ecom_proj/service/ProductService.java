package com.rishith.ecom_proj.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rishith.ecom_proj.model.Product;
import com.rishith.ecom_proj.repo.ProductRepo;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

}
