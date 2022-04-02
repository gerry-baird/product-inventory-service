package com.gerry.productinventoryservice.model;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    private String description;
    private BigDecimal price;
    private Integer quantityOnHand = 0;

    public Product() {
    }

    public Product(Integer productId, String description, BigDecimal price, Integer quantityOnHand) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
}
