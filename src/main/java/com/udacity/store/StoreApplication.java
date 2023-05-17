package com.udacity.store;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class StoreApplication  implements CommandLineRunner {

    public static void main(String[] args) {
            SpringApplication.run(StoreApplication.class, args);
        }

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        // TODO: Populate the database with products

        Product p1=  new Product(1L,"Dumbbell Hand Weight",  30.80, "https://m.media-amazon.com/images/I/81+89Mtkv0L._AC_SX679_.jpg", "Amazon Basics Rubber Encased Hex Dumbbell");
        productRepository.save(p1);
        Product p2=  new Product(2L,"Yoga Mat with Strap",  100.50, "https://m.media-amazon.com/images/I/91cJwPOdbmL._AC_SX679_.jpg", "1/3 Inch Extra Thick Yoga Mat Double-Sided Non Slip");
        productRepository.save(p2);
        Product p3=  new Product(3L,"Graphite Pickleball Paddles Set",  150.85, "https://m.media-amazon.com/images/I/718j+oNxBxL._AC_SX679_.jpg", "Polypropylene Lightweight Honeycomb Core, 3 Indoor 3 Outdoor Pickleball");
        productRepository.save(p3);

        System.out.println("Products saved successfully!");



    }
}




