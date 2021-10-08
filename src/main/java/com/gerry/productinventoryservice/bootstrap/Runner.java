package com.gerry.productinventoryservice.bootstrap;

import com.gerry.productinventoryservice.repositories.ProductInventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private ProductInventoryRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.findAll().forEach(System.out::println);
    }
}
