package com.medshoes.springbootapi.repository;

import com.medshoes.springbootapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

    Product findByPrice(double price);
}


