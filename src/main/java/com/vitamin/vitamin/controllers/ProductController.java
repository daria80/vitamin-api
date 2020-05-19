package com.vitamin.vitamin.controllers;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping// create a product
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PostMapping("/{id}")// update the product by id
    public Product update(@PathVariable long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @GetMapping// read all products
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")// read the product by id
    public Product findById(@PathVariable long id) {
        return productService.findById(id);
    }

    @DeleteMapping("/{id}")// delete the product by id
    public void deleteById(@PathVariable long id) {
        productService.deleteById(id);
    }

}
