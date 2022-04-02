package com.gerry.productinventoryservice.controllers;

import com.gerry.productinventoryservice.model.Product;
import com.gerry.productinventoryservice.repositories.ProductInventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ProductInventoryController {

    private final ProductInventoryRepository productInventoryRepository;

    @GetMapping("api/v1/product/inventory")
    List<Product> listAllProducts(){
        List<Product> products = productInventoryRepository.findAll();
        return products;
    }

    @GetMapping("api/v1/{productId}/inventory")
    Product getProductById(@PathVariable int productId){

        Optional<Product> optionalProduct = productInventoryRepository.findById(productId);

        return optionalProduct.orElse(null);
    }

    @PostMapping("api/v1/products")
    Product addProduct(@RequestBody Product product){

        Product savedProduct = productInventoryRepository.save(product);
        return savedProduct;
    }

}
