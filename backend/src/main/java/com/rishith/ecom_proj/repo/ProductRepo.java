package com.rishith.ecom_proj.repo;

import com.rishith.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    // JPQL - JPA query language

    @Query()
    List<Product> searchProducts(String keyword);
}
