package com.vitamin.vitamin.controllers;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.services.ProductService;
import com.vitamin.vitamin.transfers.ProductRequest;
import com.vitamin.vitamin.transfers.ProductResponse;
import com.vitamin.vitamin.utils.converters.ProductConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping// create a product
    public ProductResponse save(@RequestBody ProductRequest product) {
        Product product1 = ProductConverter.toModel(product);
        return ProductConverter.toResponse(productService.save(product1));
    }

    @PutMapping("/{id}")// update the product by id
    public ProductResponse update(@PathVariable long id, @RequestBody ProductRequest productRequest) {
        Product product1 = ProductConverter.toModel(productRequest);
        product1 = productService.update(id,product1);
        ProductResponse productResponse = ProductConverter.toResponse(product1);
        return productResponse;
    }

    @GetMapping// read all products
    public List<ProductResponse> findAll() {
        List<ProductResponse> productResponses = new ArrayList<>();
        List<Product> products = productService.findAll();

        for(Product product : products) {
            ProductResponse productResponse = ProductConverter.toResponse(product);
            productResponses.add(productResponse);
        }
        return productResponses;
    }

    @GetMapping("/{id}")// read the product by id
    public ProductResponse findById(@PathVariable long id) {
        Product product = productService.findById(id);
        ProductResponse productResponse = ProductConverter.toResponse(product);
        return productResponse;
    }

    @DeleteMapping("/{id}")// delete the product by id
    public void deleteById(@PathVariable long id) {
        productService.deleteById(id);
    }

}
