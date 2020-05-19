package com.vitamin.vitamin.controllers;

import com.vitamin.vitamin.models.DayItem;
import com.vitamin.vitamin.services.DayItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/dayItems")
public class DayItemController {

    @Autowired
    private DayItemService dayItemService;

    @PostMapping// create a dayItem
    public DayItem save(@RequestBody DayItem dayItem) {
        return dayItemService.save(dayItem);
    }

    @PostMapping("/{id}")// update the dayItem by id
    public DayItem update(@PathVariable long id, @RequestBody DayItem dayItem) {
        return dayItemService.update(id,dayItem);
    }

    @GetMapping// read all dayItems
    public List<DayItem> findAll() {
        return dayItemService.findAll();
    }

    @GetMapping("/{id}")// read the dayItem by id
    public DayItem findById(@PathVariable long id) {
        return dayItemService.findById(id);
    }

    @DeleteMapping("/{id}")// delete the dayItem by id
    public void deleteById(@PathVariable long id) {
        dayItemService.deleteById(id);
    }
}


