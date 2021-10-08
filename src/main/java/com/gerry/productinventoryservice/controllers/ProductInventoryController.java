package com.gerry.productinventoryservice.controllers;

import com.gerry.productinventoryservice.model.Product;
import com.gerry.productinventoryservice.repositories.ProductInventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
