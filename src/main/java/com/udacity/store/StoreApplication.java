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

        Product p1=  new Product(1L,"Face Massage Roller Jade",  20.70, "https://z.nooncdn.com/products/tr:n-t_400/v1662375577/N45772376A_1.jpg", "Essence I Love Extreme Crazy Volume Mascara - Black");
        productRepository.save(p1);
        Product p2=  new Product(2L,"Facial Sheet Masks For The Skin Nourishing",  186.19, "https://z.nooncdn.com/products/tr:n-t_400/v1661432373/N47249855A_1.jpg", "Nars Liquid Blush - Torrid");
        productRepository.save(p2);
        Product p3=  new Product(3L,"Clay Mask And Body Scrub Pore Refiner",  79.99, "https://z.nooncdn.com/products/tr:n-t_200/v1661940754/N45720704A_12.jpg", "KIKO Unlimited Double Touch Lipstick - 103");
        productRepository.save(p3);

        System.out.println("Products saved successfully!");



    }
}




