package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.exceptions.ProductNotFoundException;
import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.repositories.ProductRepository;
import com.vitamin.vitamin.repositories.VitaminRepository;
import com.vitamin.vitamin.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(long id, Product product) {
        if(productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        } else {
            throw new ProductNotFoundException("ProductNotFound by id");
        }
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(long id) {
       return productRepository.findById(id).orElseThrow(
                ()-> new ProductNotFoundException("ProductNotFound by id"));
    }

    @Override
    public void deleteById(long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        } else {
            throw new ProductNotFoundException("ProductNotFound by id");
        }

    }
}
