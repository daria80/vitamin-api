package com.vitamin.vitamin.controllers;

import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.services.VitaminService;
import com.vitamin.vitamin.transfers.VitaminRequest;
import com.vitamin.vitamin.transfers.VitaminResponse;

import com.vitamin.vitamin.utils.converters.VitaminConverter;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vitamins")
public class VitaminController {

    @Autowired
    private VitaminService vitaminService;

    @Autowired
    private Mapper mapper;

    @PostMapping// create a vitamin
    public VitaminResponse save(@RequestBody VitaminRequest vitamin) {
        return VitaminConverter.toResponse(vitaminService.save(vitamin));
    }

    @PostMapping ("/{id}")// update the vitamin by id
    public Vitamin update(@PathVariable long id,@RequestBody Vitamin vitamin) {
        return vitaminService.update(id,vitamin);
    }

    @GetMapping// read all vitamins
    public List<VitaminResponse> findAll() {
        return  vitaminService.findAll().stream()
                .map(VitaminConverter::toResponse)
                .collect(Collectors.toList());
    }

    @GetMapping ("/{id}")// read the vitamin by id
    public Vitamin findById(@PathVariable long id) {
        return vitaminService.findById(id);
    }

    @DeleteMapping ("/{id}")// delete the vitamin by id
    public void deleteById(@PathVariable long id) {
        vitaminService.deleteById(id);
    }




}
