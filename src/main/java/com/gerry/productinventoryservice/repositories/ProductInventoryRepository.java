package com.gerry.productinventoryservice.repositories;

import com.gerry.productinventoryservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInventoryRepository extends JpaRepository<Product, String> {

}
