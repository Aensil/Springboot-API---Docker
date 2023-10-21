package com.uptc.frw.controller;

import com.uptc.frw.jpa.entity.AditionalOption;
import com.uptc.frw.service.AditionalOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aditionaloption")
public class AditionalOptionController {
    @Autowired
    private AditionalOptionService aditionalOptionService;

    @GetMapping//GET ALL
    public List<AditionalOption> findAll(){
        return aditionalOptionService.findAllAditionalOption();
    }

    @PostMapping//POST A ADITIONAL OPTION
    public AditionalOption saveAditionalOption(@RequestBody AditionalOption aditionalOption){
        return aditionalOptionService.saveAditionalOption(aditionalOption);
    }

    @GetMapping("{id}")//GET BY ID
    public AditionalOption findAditionalOption(@PathVariable Long id){
        return aditionalOptionService.findAditionalOption(id);
    }

    @DeleteMapping("/{id}")//DELETE BY ID
    public void deleteAditionalOption(@PathVariable Long id){
        aditionalOptionService.deleteAditionalOption(id);
    }

    @PutMapping("/{id}")//UPDATE PRICE BY ID
    public AditionalOption updatePriceOption(@PathVariable Long id,@RequestBody Double price){
        return aditionalOptionService.updatePriceOption(id,price);
    }
}
