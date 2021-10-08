package com.gerry.productinventoryservice.repositories;

import com.gerry.productinventoryservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductInventoryRepository extends JpaRepository<Product, UUID> {
}
