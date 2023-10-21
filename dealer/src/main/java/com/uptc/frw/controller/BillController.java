package com.uptc.frw.controller;

import com.uptc.frw.jpa.entity.Bill;
import com.uptc.frw.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping//GET ALL
    public List<Bill> findAll(){
        return billService.findAllBill();
    }

    @PostMapping//POST A CAR
    public Bill saveBill(@RequestBody Bill bill){
        return billService.saveBill(bill);
    }

    @GetMapping("{id}")//GET BY ID
    public Bill findBill(@PathVariable Long id){
        return billService.findBill(id);
    }

    @DeleteMapping("/{id}")//DELETE BY ID
    public void deleteCar(@PathVariable Long id){
        billService.deleteBill(id);
    }

    @PutMapping("/{id}")//UPDATE PRICE BY ID
    public Bill updatePrice(@PathVariable Long id,@RequestBody Double price){
        return billService.updatePrice(id,price);
    }
}
