package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Vitamin;

public interface VitaminService {

    Vitamin save(Vitamin vitamin);

    Vitamin update(String id, Vitamin vitamin);

    Vitamin findById(String id);

    void deleteById(String id);

}
