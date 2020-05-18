package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.repositories.VitaminRepository;
import com.vitamin.vitamin.services.VitaminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VitaminServiceImpl implements VitaminService {

    @Autowired
    private VitaminRepository vitaminRepository;

    @Override
    public Vitamin save(Vitamin vitamin) {
//        Vitamin savedVitamin;
//        savedVitamin = vitamin;
//        savedVitamin.setId(vitamin.getId());
//        return vitaminRepository.save(savedVitamin);
        vitamin.setId(UUID.randomUUID().toString());
        return vitaminRepository.save(vitamin);
    }

    @Override
    public Vitamin update(String id, Vitamin vitamin) {
        if (vitaminRepository.existsById(id)) {
            vitamin.setId(id);
            return vitaminRepository.save(vitamin);
        } else {
            throw new RuntimeException("VitaminNotFound by id");
        }
    }

    @Override
    public Vitamin findById(String id) {
        return vitaminRepository.findById(id).orElseThrow(
                () -> new RuntimeException("VitaminNotFound by id"));
    }

    @Override
    public void deleteById(String id) {
        if (vitaminRepository.existsById(id)) {
            vitaminRepository.deleteById(id);
        } else {
            throw new RuntimeException("VitaminNotFound by id");
        }
    }
}
