package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Day;
import java.util.List;

public interface DayService {

    Day save(Day day);

    Day update(long id, Day day);

    List<Day> findAll();

    Day findById(long id);

    void deleteById(long id);


}
