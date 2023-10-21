package com.uptc.frw.controller;

import com.uptc.frw.jpa.entity.AllOptions;
import com.uptc.frw.service.AllOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alloptions")
public class AllOptionsController {
    @Autowired
    private AllOptionsService allOptionsService;

    @GetMapping//GET ALL
    public List<AllOptions> findAll(){
        return allOptionsService.findAllOptions();
    }

    @PostMapping//POST A OPTION REGISTER
    public AllOptions saveAllOptions(@RequestBody AllOptions allOptions){
        return allOptionsService.saveAllOptions(allOptions);
    }

    @GetMapping("{id}")//GET BY ID
    public AllOptions findAllOptions(@PathVariable Long id){
        return allOptionsService.findAllOptionsId(id);
    }

    @DeleteMapping("/{id}")//DELETE BY ID
    public void deleteAllOptions(@PathVariable Long id){
        allOptionsService.deleteAllOptions(id);
    }

}
