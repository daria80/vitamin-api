package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.Day;
import com.vitamin.vitamin.repositories.DayItemRepository;
import com.vitamin.vitamin.repositories.DayRepository;
import com.vitamin.vitamin.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class DayServiceImpl implements DayService {

    @Autowired
    private DayRepository dayRepository;


    @Override
    public Day save(Day day) {
        day.setId(UUID.randomUUID().toString());
        return null;
    }

    @Override
    public Day update(String id, Day day) {
        return null;
    }

    @Override
    public Day findById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
