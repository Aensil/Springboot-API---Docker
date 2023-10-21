package com.uptc.frw.controller;


import com.uptc.frw.jpa.entity.Seller;
import com.uptc.frw.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @GetMapping//GET ALL
    public List<Seller> findAll(){
        return sellerService.findAllSeller();
    }

    @PostMapping//POST A SELLER
    public Seller saveSeller(@RequestBody Seller seller){
        return sellerService.saveSeller(seller);
    }

    @GetMapping("{id}")//GET BY ID
    public Seller findSeller(@PathVariable Long id){
        return sellerService.findSeller(id);
    }

    @DeleteMapping("/{id}")//DELETE BY ID
    public void deleteSeller(@PathVariable Long id){
        sellerService.deleteSeller(id);
    }

    @PutMapping("/{id}")//UPDATE Phone BY ID
    public Seller updatePhone(@PathVariable Long id,@RequestBody Long phone){
        return sellerService.updatePhone(id, phone);
    }
}
