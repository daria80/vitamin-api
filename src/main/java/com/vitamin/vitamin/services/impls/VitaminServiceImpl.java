package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.repositories.ProductRepository;
import com.vitamin.vitamin.repositories.VitaminRepository;
import com.vitamin.vitamin.services.VitaminService;
import com.vitamin.vitamin.transfers.VitaminRequest;
import com.vitamin.vitamin.utils.converters.VitaminConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VitaminServiceImpl implements VitaminService {

    @Autowired
    private VitaminRepository vitaminRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Vitamin save(VitaminRequest vitamin) {
//        Vitamin savedVitamin;
//        savedVitamin = vitamin;
//        savedVitamin.setId(vitamin.getId());
//        return vitaminRepository.save(savedVitamin);
        Product product = productRepository.findById(vitamin.getProductId()).orElseThrow(
                ()-> new RuntimeException("ProductNotFound by id"));
        Vitamin entity = VitaminConverter.toModel(vitamin);
        entity.setProduct(product);
        Vitamin v = vitaminRepository.save(entity);
        return v;
    }

    @Override
    public Vitamin update(long id, Vitamin vitamin) {
        if (vitaminRepository.existsById(id)) {
            vitamin.setId(id);
            return vitaminRepository.save(vitamin);
        } else {
            throw new RuntimeException("VitaminNotFound by id");
        }
    }

    @Override
    public List<Vitamin> findAll() {
        return vitaminRepository.findAll();
    }

    @Override
    public Vitamin findById(long id) {
        return vitaminRepository.findById(id).orElseThrow(
                () -> new RuntimeException("VitaminNotFound by id"));
    }

    @Override
    public void deleteById(long id) {
        if (vitaminRepository.existsById(id)) {
            vitaminRepository.deleteById(id);
        } else {
            throw new RuntimeException("VitaminNotFound by id");
        }
    }
}
