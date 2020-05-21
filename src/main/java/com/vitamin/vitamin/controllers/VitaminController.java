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

import java.util.ArrayList;
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
        Vitamin vitamin1 = VitaminConverter.toModel(vitamin);
        return VitaminConverter.toResponse(vitaminService.save(vitamin1));
    }

    @PostMapping ("/{id}")// update the vitamin by id
    public VitaminResponse update(@PathVariable long id,@RequestBody VitaminRequest vitaminRequest) {
        Vitamin vitamin = VitaminConverter.toModel(vitaminRequest);
        vitamin = vitaminService.update(id, vitamin);
        VitaminResponse vitaminResponse = VitaminConverter.toResponse(vitamin);
        return vitaminResponse;
    }

    @GetMapping// read all vitamins
    public List<VitaminResponse> findAll() {
//        return  vitaminService.findAll().stream()
//                //.map(VitaminConverter::toResponse)
//                .map(vitamin -> VitaminConverter.toResponse(vitamin))
//                .collect(Collectors.toList());
        List<VitaminResponse> vitaminResponses = new ArrayList<>();//
        List<Vitamin> vitamins = vitaminService.findAll();

        for (Vitamin vitamin : vitamins) {
            VitaminResponse vitaminResponse = VitaminConverter.toResponse(vitamin);
            vitaminResponses.add(vitaminResponse);
        }
        return vitaminResponses;
    }

    @GetMapping ("/{id}")// read the vitamin by id
    public VitaminResponse findById(@PathVariable long id) {
        Vitamin vitamin = vitaminService.findById(id);
        VitaminResponse vitaminResponse = VitaminConverter.toResponse(vitamin);
        return vitaminResponse;
    }

    @DeleteMapping ("/{id}")// delete the vitamin by id
    public void deleteById(@PathVariable long id) {
        vitaminService.deleteById(id);
    }




}
