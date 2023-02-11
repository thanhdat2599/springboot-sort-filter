package com.datdt.sortfilterdemo;

import com.datdt.sortfilterdemo.entity.Category;
import com.datdt.sortfilterdemo.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CategoryRepository repository) {
        return args -> {
            for (int i = 1; i < 100; i++) {
                Category category = new Category();
                category.setCode("code " + i);
                category.setName("name " + i);
                category.setStatus("OK");
                category.setCreatedDate(LocalDateTime.now());
                category.setUpdatedDate(LocalDateTime.now());
                repository.save(category);
            }
        };
    }
}
