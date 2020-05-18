package com.vitamin.vitamin.controllers;

import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.services.VitaminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vitamins")
public class VitaminController {

    @Autowired
    private VitaminService vitaminService;

    @PostMapping
    public Vitamin save (@RequestBody Vitamin vitamin) {
        return vitaminService.save(vitamin);
    }
    @PostMapping ("{id}")
    public Vitamin update (String id,@RequestBody Vitamin vitamin) {
        return vitaminService.save(vitamin);
    }


    @GetMapping ("{id}")
    public Vitamin findById(@PathVariable String id) {
        return vitaminService.findById(id);
    }

    @DeleteMapping ("{id}")
    public void deleteById(@PathVariable String id) {
        vitaminService.deleteById(id);
    }




}
