package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.Day;
import com.vitamin.vitamin.repositories.DayItemRepository;

import com.vitamin.vitamin.repositories.DayRepository;
import com.vitamin.vitamin.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayServiceImpl implements DayService {

    @Autowired
    private DayRepository dayRepository;


    @Override
    public Day save(Day day) {
        return dayRepository.save(day);
    }

    @Override
    public Day update(long id, Day day) {
        if(dayRepository.existsById(id)) {
            day.setId(id);
            return dayRepository.save(day);
        } else {
            throw new RuntimeException("DayNotFound by id");
        }
    }

    @Override
    public List<Day> findAll() {
        return dayRepository.findAll();
    }

    @Override
    public Day findById(long id) {
        return dayRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("DayNotFound by id"));
    }

    @Override
    public void deleteById(long id) {
        if(dayRepository.existsById(id)) {
            dayRepository.deleteById(id);
        } else {
            throw new RuntimeException("DayNotFound by id");
        }

    }
}
