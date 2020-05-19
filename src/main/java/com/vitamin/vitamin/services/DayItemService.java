package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.DayItem;
import java.util.List;

public interface DayItemService {

    DayItem save(DayItem dayItem);

    DayItem update(long id, DayItem dayItem);

    List<DayItem> findAll();

    DayItem findById(long id);

    void deleteById(long id);
}
