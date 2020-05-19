package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.Day;
import com.vitamin.vitamin.models.DayItem;
import com.vitamin.vitamin.repositories.DayItemRepository;
import com.vitamin.vitamin.repositories.DayRepository;
import com.vitamin.vitamin.services.DayItemService;
import com.vitamin.vitamin.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayItemServiceImpl implements DayItemService {

    @Autowired
    private DayItemRepository dayItemRepository;

    @Override
    public DayItem save(DayItem dayItem) {
        return dayItemRepository.save(dayItem);
    }

    @Override
    public DayItem update(long id, DayItem dayItem) {
        if(dayItemRepository.existsById(id)) {
            return dayItemRepository.save(dayItem);
        } else {
            throw new RuntimeException("DayItemNotFound by id");
        }
    }

    @Override
    public List<DayItem> findAll() {
        return dayItemRepository.findAll();
    }

    @Override
    public DayItem findById(long id) {
        return dayItemRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("DayItemNotFound by id"));
    }

    @Override
    public void deleteById(long id) {
        if (dayItemRepository.existsById(id)) {
            dayItemRepository.deleteById(id);
        } else {
            throw new RuntimeException("DayItemNotFound by id");
        }
    }
}
