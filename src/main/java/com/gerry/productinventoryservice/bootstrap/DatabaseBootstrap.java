package com.gerry.productinventoryservice.bootstrap;

import com.gerry.productinventoryservice.model.Product;
import com.gerry.productinventoryservice.repositories.ProductInventoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
@AllArgsConstructor
public class DatabaseBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ProductInventoryRepository productRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        log.info("Database contains {} products.", productRepository.count());

        if(productRepository.count() == 0L){
            log.info("Loading default product set into database.");
            loadProducts();
        }


    }

    private void loadProducts(){
        double val = 77.48;
        Product p1 = new Product();
        p1.setDescription("Widget");
        p1.setPrice(new BigDecimal(val));

        productRepository.save(p1);
    }


}
