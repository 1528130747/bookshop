package com.csu.bookshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.csu.bookshop.dao")
public class BookshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopApplication.class, args);
    }

}
