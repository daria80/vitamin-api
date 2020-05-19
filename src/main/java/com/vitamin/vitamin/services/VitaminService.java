package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.transfers.VitaminRequest;

import java.util.List;

public interface VitaminService {

    Vitamin save(VitaminRequest vitamin);

    Vitamin update(long id, Vitamin vitamin);

    List<Vitamin> findAll();

    Vitamin findById(long id);

    void deleteById(long id);

}
