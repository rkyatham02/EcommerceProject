package com.rishith.ecom_proj.model;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data; // for automatically creating getters and setters
import lombok.NoArgsConstructor;

@Entity // JPA needs entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id // setting primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean available;
    private int quantity;

    private String imageName;
    private String imageType;
    @Lob // since imageData is usually a large object
    private byte[] imageData; //storing image in database for now

}
