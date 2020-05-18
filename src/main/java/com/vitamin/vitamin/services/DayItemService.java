package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.DayItem;

public interface DayItemService {

    DayItem save(DayItem dayItem);

    DayItem update(DayItem dayItem);

    DayItem findById(String id);

    void deleteById(String id);
}
