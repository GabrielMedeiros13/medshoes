package com.medshoes.springbootapi.controller;

import com.medshoes.springbootapi.entity.Product;
import com.medshoes.springbootapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product findById(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping("/product/{name}")
    public Product findByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    @GetMapping("/product/{price}")
    public Product findById(@PathVariable double price){
        return service.getProductByPrice(price);
    }


    @PutMapping("/product/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/product/delete/{id}")
    public String  deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }



}
