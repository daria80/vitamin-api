package com.vitamin.vitamin.controllers;

import com.vitamin.vitamin.models.Day;
import com.vitamin.vitamin.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/days")
public class DayController {

    @Autowired
    private DayService dayService;

    @PostMapping// create a day
    public Day save(@RequestBody Day day) {
        return dayService.save(day);
    }

    @PostMapping("/{id}")// update the day by id
    public Day update(@PathVariable long id, @RequestBody Day day) {
        return dayService.update(id, day);
    }

    @GetMapping// read all days
    public List<Day> findAll() {
        return dayService.findAll();
    }

    @GetMapping("/{id}")// read the day by id
    public Day findById(@PathVariable long id) {
        return  dayService.findById(id);
    }

    @DeleteMapping("/{id}")// delete the day by id
    public void deleteById(@PathVariable long id) {
        dayService.deleteById(id);
    }

}
