package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Product;

public interface DayService {

    DayService save(DayService dayService);

    DayService update(String id, DayService dayService);

    DayService findById(String id);

    void deleteById(String id);


}
