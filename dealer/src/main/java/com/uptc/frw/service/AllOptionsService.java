package com.uptc.frw.service;

import com.uptc.frw.jpa.entity.AditionalOption;
import com.uptc.frw.jpa.entity.AllOptions;
import com.uptc.frw.jpa.entity.Bill;
import com.uptc.frw.jpa.repository.AllOptionsRepository;
import com.uptc.frw.jpa.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllOptionsService {
    @Autowired
    private AllOptionsRepository allOptionsRepository;

    @Autowired
    private AditionalOptionService aditionalOptionService;

    @Autowired
    private BillService billService;

    public List<AllOptions> findAllOptions(){
        return allOptionsRepository.findAll();
    }


    public AllOptions saveAllOptions(AllOptions allOptions){
        AditionalOption aditionalOption = aditionalOptionService.findAditionalOption(allOptions.getIdOption());
        Bill bill = billService.findBill(allOptions.getIdSell());
        allOptions.setAditionalOption(aditionalOption);
        allOptions.setBill(bill);
        return allOptionsRepository.save(allOptions);
    }

    public AllOptions findAllOptionsId(Long id){
        return allOptionsRepository.findById(id).get();
    }

    public void deleteAllOptions(Long id){
        allOptionsRepository.deleteById(id);
    }


}
